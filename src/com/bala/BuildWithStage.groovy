package com.bala

class BuildWithStage {
    def script

    BuildWithStage(script){
        println("loading from BuildWithStage class file")
        this.script = script
    }

    static BuildWithStage newInstance(def script){
        return new BuildWithStage(script)
    }

    def build(){
        script.println"###########################################"
        script.println"Hello Bala !!!!!!!!!"
        script.println"Job starting"
        script.println"###########################################"
        script.stage('Build'){
            script.println"compiling..."
        }
        script.stage('Test'){
            script.println"testing..."
        }
        script.stage('Deploy'){
            script.println"deploying..."
        }
        script.stage('release'){
            script.println"releasing artifacts "
        }
        script.println"###########################################"
        script.println"Job completed"
        script.println"###########################################"

    }
}
