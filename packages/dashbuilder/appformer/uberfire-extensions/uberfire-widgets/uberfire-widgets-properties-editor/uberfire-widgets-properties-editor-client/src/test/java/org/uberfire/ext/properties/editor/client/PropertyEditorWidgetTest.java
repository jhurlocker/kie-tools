/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.ext.properties.editor.client;

import com.google.gwtmockito.GwtMockitoTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(GwtMockitoTestRunner.class)
public class PropertyEditorWidgetTest {

    PropertyEditorWidget propertyEditor;

    @Before
    public void setUp() throws Exception {
        propertyEditor = new PropertyEditorWidget();
    }

    @Test
    public void handleExpandedCategoriesTest() throws Exception {
        assertTrue(propertyEditor.getExpandedCategories().isEmpty());

        propertyEditor.addExpandedCategory("CAT1",
                                           "CAT2");

        assertEquals(2,
                     propertyEditor.getExpandedCategories().size());
        assertEquals("CAT2",
                     propertyEditor.getLastOpenAccordionGroupTitle());

        propertyEditor.collapseCategory("CAT2");

        assertEquals(1,
                     propertyEditor.getExpandedCategories().size());
    }
}