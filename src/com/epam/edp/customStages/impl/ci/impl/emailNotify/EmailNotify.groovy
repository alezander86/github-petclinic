package com.epam.edp.customStages.impl.ci.impl.emailNotify

import com.epam.edp.stages.impl.ci.ProjectType
import com.epam.edp.stages.impl.ci.Stage

@Stage(name = "email-notify", buildTool = "maven", type = ProjectType.APPLICATION)
class EmailNotify {
    Script script
    void run(context) {
        ------------------'Your custom logic here'
        script.println("[emailNotify]My message")
    }
}