/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.dmn.client.editors.types.common.errors;

import com.google.gwtmockito.GwtMockitoTestRunner;
import org.jboss.errai.ui.client.local.spi.TranslationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.workbench.common.dmn.client.editors.types.common.DataType;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.kie.workbench.common.dmn.client.resources.i18n.DMNEditorConstants.DataTypeNameIsNotUniqueErrorMessage_RegularMessage;
import static org.kie.workbench.common.dmn.client.resources.i18n.DMNEditorConstants.DataTypeNameIsNotUniqueErrorMessage_StrongMessage;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(GwtMockitoTestRunner.class)
public class DataTypeNameIsNotUniqueErrorMessageTest {

    @Mock
    private TranslationService translationService;

    @Test
    public void testGetStrongMessage() {

        final DataType dataType = mock(DataType.class);
        final String dataTypeName = "name";
        final String expectedErrorMessage = "*Expected strong message.*";
        final DataTypeNameIsNotUniqueErrorMessage errorMessage = new DataTypeNameIsNotUniqueErrorMessage(translationService);

        when(dataType.getName()).thenReturn(dataTypeName);
        when(translationService.format(DataTypeNameIsNotUniqueErrorMessage_StrongMessage, dataTypeName)).thenReturn(expectedErrorMessage);

        final String actualErrorMessage = errorMessage.getStrongMessage(dataType);

        assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Test
    public void testGetRegularMessage() {

        final String expectedErrorMessage = "Expected regular message.";
        final DataTypeNameIsNotUniqueErrorMessage errorMessage = new DataTypeNameIsNotUniqueErrorMessage(translationService);

        when(translationService.format(DataTypeNameIsNotUniqueErrorMessage_RegularMessage)).thenReturn(expectedErrorMessage);

        final String actualErrorMessage = errorMessage.getRegularMessage();

        assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}
