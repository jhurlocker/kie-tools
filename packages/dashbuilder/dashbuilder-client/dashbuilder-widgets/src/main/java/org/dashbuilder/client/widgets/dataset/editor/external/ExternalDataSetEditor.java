/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
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
package org.dashbuilder.client.widgets.dataset.editor.external;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import javax.inject.Inject;

import org.dashbuilder.client.widgets.dataset.editor.DataSetDefColumnsFilterEditor;
import org.dashbuilder.client.widgets.dataset.editor.DataSetDefPreviewTable;
import org.dashbuilder.client.widgets.dataset.editor.DataSetEditor;
import org.dashbuilder.client.widgets.dataset.editor.attributes.DataSetDefBackendCacheAttributesEditor;
import org.dashbuilder.client.widgets.dataset.editor.attributes.DataSetDefBasicAttributesEditor;
import org.dashbuilder.client.widgets.dataset.editor.attributes.DataSetDefClientCacheAttributesEditor;
import org.dashbuilder.client.widgets.dataset.editor.attributes.DataSetDefRefreshAttributesEditor;
import org.dashbuilder.client.widgets.dataset.event.ErrorEvent;
import org.dashbuilder.client.widgets.dataset.event.TabChangedEvent;
import org.dashbuilder.common.client.editor.ValueBoxEditor;
import org.dashbuilder.common.client.widgets.LoadingBox;
import org.dashbuilder.dataset.client.DataSetClientServices;
import org.dashbuilder.dataset.def.ExternalDataSetDef;

/**
 * <p>External Data Set editor presenter.</p>
 * 
 */
@Dependent
public class ExternalDataSetEditor extends DataSetEditor<ExternalDataSetDef> implements org.dashbuilder.dataset.client.editor.ExternalDataSetDefEditor {

    ExternalDataSetDefAttributesEditor attributesEditor;
    
    @Inject
    public ExternalDataSetEditor(final DataSetDefBasicAttributesEditor basicAttributesEditor,
                            final ExternalDataSetDefAttributesEditor attributesEditor,
                            final DataSetDefColumnsFilterEditor columnsAndFilterEditor,
                            final DataSetDefPreviewTable previewTable,
                            final DataSetDefBackendCacheAttributesEditor backendCacheAttributesEditor,
                            final DataSetDefClientCacheAttributesEditor clientCacheAttributesEditor,
                            final DataSetDefRefreshAttributesEditor refreshEditor,
                            final DataSetClientServices clientServices,
                            final LoadingBox loadingBox,
                            final Event<ErrorEvent> errorEvent,
                            final Event<TabChangedEvent> tabChangedEvent,
                            final View view) {
        super(basicAttributesEditor, attributesEditor.view, columnsAndFilterEditor, 
                previewTable, backendCacheAttributesEditor, clientCacheAttributesEditor,
                refreshEditor, clientServices, loadingBox, errorEvent, tabChangedEvent, view);
        this.attributesEditor = attributesEditor;
    }

    @PostConstruct
    public void init() {
        super.init();
    }

    @Override
    public ValueBoxEditor<String> url() {
        return attributesEditor.url();
    }


    @Override
    public void setValue(final ExternalDataSetDef value) {
        super.setValue(value);
        attributesEditor.setValue(value);
    }
}
