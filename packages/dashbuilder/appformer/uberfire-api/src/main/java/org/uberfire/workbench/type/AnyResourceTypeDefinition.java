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

package org.uberfire.workbench.type;

import org.uberfire.backend.vfs.Path;
import org.uberfire.workbench.category.Category;

public class AnyResourceTypeDefinition implements ResourceTypeDefinition {

    private Category category;

    public AnyResourceTypeDefinition() {
    }

    public AnyResourceTypeDefinition(final Category category) {
        this.category = category;
    }

    @Override
    public String getShortName() {
        return "any";
    }

    @Override
    public String getDescription() {
        return "Others";
    }

    @Override
    public String getPrefix() {
        return "";
    }

    @Override
    public String getSuffix() {
        return "";
    }

    @Override
    public int getPriority() {
        return Integer.MIN_VALUE;
    }

    @Override
    public String getSimpleWildcardPattern() {
        return "*";
    }

    @Override
    public boolean accept(final Path path) {
        return true;
    }

    @Override
    public Category getCategory() {
        return this.category;
    }
}
