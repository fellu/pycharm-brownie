package com.github.fellu.pycharmbrownie.services

import com.intellij.openapi.project.Project
import com.github.fellu.pycharmbrownie.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
