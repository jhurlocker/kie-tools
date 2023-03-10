/*
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
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
package org.dashbuilder.client.widgets.dataset.editor.attributes;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import com.google.gwt.editor.client.EditorDelegate;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import org.dashbuilder.client.widgets.resources.i18n.DataSetEditorConstants;
import org.dashbuilder.common.client.editor.ToggleSwitchEditor;
import org.dashbuilder.common.client.editor.ValueBoxEditor;
import org.dashbuilder.common.client.event.ValueChangeEvent;
import org.dashbuilder.dataset.def.DataSetDef;
import org.gwtbootstrap3.client.ui.constants.Placement;

import static org.kie.soup.commons.validation.PortablePreconditions.checkNotNull;

/**
 * <p>Data Set backend cache attributes editor presenter.</p>
 *
 * @since 0.4.0
 */
@Dependent
public class DataSetDefBackendCacheAttributesEditor implements IsWidget,
                                                               org.dashbuilder.dataset.client.editor.DataSetDefBackendCacheAttributesEditor {

    ToggleSwitchEditor cacheEnabled;
    ValueBoxEditor<Integer> cacheMaxRows;
    public DataSetDefCacheAttributesEditorView view;

    @Inject
    public DataSetDefBackendCacheAttributesEditor(final ToggleSwitchEditor cacheEnabled,
                                                  final ValueBoxEditor<Integer> cacheMaxRows,
                                                  final DataSetDefCacheAttributesEditorView view) {
        this.cacheEnabled = cacheEnabled;
        this.cacheMaxRows = cacheMaxRows;
        this.view = view;
    }

    @PostConstruct
    public void init() {
        view.init(viewCallback);
        view.init(DataSetEditorConstants.INSTANCE.backendCache(),
                  DataSetEditorConstants.INSTANCE.rows(),
                  cacheEnabled.asWidget(),
                  cacheMaxRows.view);
        cacheMaxRows.addHelpContent(DataSetEditorConstants.INSTANCE.attributeMaxRows(),
                                    DataSetEditorConstants.INSTANCE.attributeMaxRows_description(),
                                    Placement.BOTTOM);
    }

    public void setRange(final Double min,
                         final Double max) {
        view.setRange(min,
                      max);
    }

    @Override
    public Widget asWidget() {
        return view.asWidget();
    }

    /*************************************************************
     ** GWT EDITOR CONTRACT METHODS **
     *************************************************************/

    @Override
    public ToggleSwitchEditor cacheEnabled() {
        return cacheEnabled;
    }

    @Override
    public ValueBoxEditor<Integer> cacheMaxRows() {
        return cacheMaxRows;
    }

    @Override
    public void flush() {

    }

    @Override
    public void onPropertyChange(final String... paths) {

    }

    @Override
    public void setValue(final DataSetDef value) {
        Double _value = value != null ? value.getCacheMaxRows() : 100d;
        if (value != null && value.isCacheEnabled()) {
            enable();
        } else {
            disable();
        }
        view.setValue(_value);
    }

    @Override
    public void setDelegate(final EditorDelegate<DataSetDef> delegate) {

    }

    /*************************************************************
     ** VIEW CALLBACK METHODS **
     *************************************************************/

    final DataSetDefCacheAttributesEditorView.ViewCallback viewCallback = new DataSetDefCacheAttributesEditorView.ViewCallback() {
        @Override
        public void onValueChange(final Double value) {
            cacheMaxRows.setValue(value != null ? value.intValue() : 100);
        }
    };

    /*************************************************************
     ** PRIVATE PRESENTER METHODS **
     *************************************************************/

    void enable() {
        view.setEnabled(true);
    }

    void disable() {
        view.setEnabled(false);
    }

    void onEnabledChangedEvent(@Observes ValueChangeEvent<Boolean> valueChangeEvent) {
        checkNotNull("valueChangeEvent",
                     valueChangeEvent);
        if (valueChangeEvent.getContext().equals(cacheEnabled)) {
            if (valueChangeEvent.getValue()) {
                enable();
            } else {
                disable();
            }
        }
    }
}
