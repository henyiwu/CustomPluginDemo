package com.example.custom_plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin : Plugin<Project>{
    override fun apply(project: Project) {
        println("myPlugin被应用")
        val customTask = project.tasks.create("customTask")
        customTask.doLast {
            println("Custom Task do Last")
        }
    }
}
