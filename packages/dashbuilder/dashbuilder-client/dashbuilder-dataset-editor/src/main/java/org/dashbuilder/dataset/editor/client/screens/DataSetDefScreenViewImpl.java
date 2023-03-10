/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
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
package org.dashbuilder.dataset.editor.client.screens;

import javax.enterprise.context.Dependent;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import org.uberfire.ext.editor.commons.client.BaseEditorViewImpl;

@Dependent
public class DataSetDefScreenViewImpl extends BaseEditorViewImpl implements DataSetDefScreenView {

    final FlowPanel mainPanel = new FlowPanel();

    public DataSetDefScreenViewImpl() {
    }

    
    @Override
    public Widget asWidget() {
        return mainPanel;
    }


    @Override
    public void setWidget(final IsWidget widget) {
        mainPanel.clear();
        mainPanel.add(widget);
    }
}