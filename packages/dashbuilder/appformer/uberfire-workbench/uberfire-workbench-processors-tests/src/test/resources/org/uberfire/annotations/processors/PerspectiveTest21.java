package org.uberfire.annotations.processors;

import org.uberfire.client.annotations.Perspective;
import org.uberfire.client.annotations.WorkbenchPerspective;
import org.uberfire.workbench.model.PerspectiveDefinition;

@WorkbenchPerspective(identifier = "PerspectiveTest21", isTransient = false)
public class PerspectiveTest21 {

    @Perspective
    public PerspectiveDefinition getPerspective() {
        return null;
    }

}
