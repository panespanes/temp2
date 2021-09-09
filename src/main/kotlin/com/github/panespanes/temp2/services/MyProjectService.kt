package com.github.panespanes.temp2.services

import com.intellij.openapi.project.Project
import com.github.panespanes.temp2.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
