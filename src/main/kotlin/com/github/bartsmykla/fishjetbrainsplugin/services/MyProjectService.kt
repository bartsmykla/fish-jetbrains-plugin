package com.github.bartsmykla.fishjetbrainsplugin.services

import com.intellij.openapi.project.Project
import com.github.bartsmykla.fishjetbrainsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
