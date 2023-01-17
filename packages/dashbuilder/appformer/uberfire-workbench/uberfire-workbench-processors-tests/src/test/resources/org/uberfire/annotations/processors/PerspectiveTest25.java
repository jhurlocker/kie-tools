/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
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

package org.uberfire.annotations.processors;

import org.uberfire.client.annotations.Perspective;
import org.uberfire.client.annotations.WorkbenchPerspective;
import org.uberfire.client.mvp.QualifierAnnotation;
import org.uberfire.client.mvp.RegularAnnotation;
import org.uberfire.workbench.model.PerspectiveDefinition;

@QualifierAnnotation( classField = String.class, stringField = "someText", booleanField = true, intField = 13 )
@RegularAnnotation( classField = String.class, stringField = "someText", booleanField = true, intField = 13 )
@WorkbenchPerspective(identifier = "PerspectiveTest25")
public class PerspectiveTest25 {

    @Perspective
    public PerspectiveDefinition getPerspective() {
        return null;
    }

}
