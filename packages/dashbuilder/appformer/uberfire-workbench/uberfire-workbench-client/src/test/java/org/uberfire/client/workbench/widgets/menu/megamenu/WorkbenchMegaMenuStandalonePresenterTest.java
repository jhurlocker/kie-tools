/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.client.workbench.widgets.menu.megamenu;

import java.util.function.Consumer;

import org.jboss.errai.ioc.client.api.ManagedInstance;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.uberfire.client.mvp.ActivityManager;
import org.uberfire.client.mvp.PerspectiveActivity;
import org.uberfire.client.mvp.PerspectiveManager;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.workbench.Workbench;
import org.uberfire.client.workbench.events.PerspectiveChange;
import org.uberfire.client.workbench.widgets.menu.megamenu.brand.MegaMenuBrand;
import org.uberfire.client.workbench.widgets.menu.megamenu.contextmenuitem.ChildContextMenuItemPresenter;
import org.uberfire.client.workbench.widgets.menu.megamenu.contextmenuitem.GroupContextMenuItemPresenter;
import org.uberfire.client.workbench.widgets.menu.megamenu.menuitem.ChildMenuItemPresenter;
import org.uberfire.client.workbench.widgets.menu.megamenu.menuitem.GroupMenuItemPresenter;
import org.uberfire.mvp.Command;
import org.uberfire.mvp.PlaceRequest;
import org.uberfire.rpc.SessionInfo;
import org.uberfire.workbench.model.ActivityResourceType;
import org.uberfire.workbench.model.menu.MenuFactory;
import org.uberfire.workbench.model.menu.MenuPosition;
import org.uberfire.workbench.model.menu.Menus;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class WorkbenchMegaMenuStandalonePresenterTest {

    @Mock
    private PerspectiveManager perspectiveManager;

    @Mock
    private ActivityManager activityManager;

    @Mock
    private WorkbenchMegaMenuPresenter.View view;

    @Mock
    private ManagedInstance<MegaMenuBrand> megaMenuBrands;

    @Mock
    private PlaceManager placeManager;

    @Mock
    private SessionInfo sessionInfo;

    @Mock
    private ManagedInstance<ChildMenuItemPresenter> childMenuItemPresenters;

    @Mock
    private ManagedInstance<GroupMenuItemPresenter> groupMenuItemPresenters;

    @Mock
    private ManagedInstance<ChildContextMenuItemPresenter> childContextMenuItemPresenters;

    @Mock
    private ManagedInstance<GroupContextMenuItemPresenter> groupContextMenuItemPresenters;

    @Mock
    private Workbench workbench;

    private WorkbenchMegaMenuStandalonePresenter presenter;

    @Before
    public void setup() {
        doReturn(true).when(megaMenuBrands).isUnsatisfied();
        presenter = spy(new WorkbenchMegaMenuStandalonePresenter(perspectiveManager,
                                                                 activityManager,
                                                                 view,
                                                                 megaMenuBrands,
                                                                 placeManager,
                                                                 childMenuItemPresenters,
                                                                 groupMenuItemPresenters,
                                                                 childContextMenuItemPresenters,
                                                                 groupContextMenuItemPresenters,
                                                                 workbench));
        doReturn(mock(ChildMenuItemPresenter.class)).when(childMenuItemPresenters).get();
    }

    @Test
    public void testAddMenus() {
        final String perspectiveId = "perspectiveId";
        final String label = "perspectiveLabel";
        final Menus menus = MenuFactory.newSimpleItem(label).perspective(perspectiveId).endMenu().build();

        presenter.addMenus(menus);

        verify(presenter,
               never()).addMenuItem(anyString(),
                                    anyString(),
                                    anyString(),
                                    any(Command.class),
                                    any(MenuPosition.class));
    }

    @Test
    public void testAddContextMenus() {
        final String perspectiveId = "perspectiveId";
        final String contextLabel = "contextLabel";
        final Menus contextMenus = MenuFactory.newSimpleItem(contextLabel).endMenu().build();
        final PerspectiveActivity activity = mock(PerspectiveActivity.class);
        final PlaceRequest placeRequest = mock(PlaceRequest.class);

        doAnswer(invocationOnMock -> {
            invocationOnMock.getArgument(0, Consumer.class).accept(contextMenus);
            return null;
        }).when(activity).getMenus(any());
        when(activity.isType(ActivityResourceType.PERSPECTIVE.name())).thenReturn(true);
        when(activityManager.getActivity(placeRequest)).thenReturn(activity);

        presenter.onPerspectiveChange(new PerspectiveChange(placeRequest,
                                                            null,
                                                            contextMenus,
                                                            perspectiveId));

        verify(presenter).addMenuItem(anyString(),
                                      eq(contextLabel),
                                      isNull(String.class),
                                      isNull(Command.class),
                                      eq(MenuPosition.LEFT));

        verify(presenter,
               never()).clearContextMenu();
        verify(presenter,
               never()).addContextMenuItem(anyString(),
                                           anyString(),
                                           anyString(),
                                           anyString(),
                                           any(Command.class),
                                           any(MenuPosition.class));
    }
}
