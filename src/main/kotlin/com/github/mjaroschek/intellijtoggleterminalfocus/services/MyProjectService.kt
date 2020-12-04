package com.github.mjaroschek.intellijtoggleterminalfocus.services

import com.intellij.openapi.project.Project
import com.github.mjaroschek.intellijtoggleterminalfocus.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
