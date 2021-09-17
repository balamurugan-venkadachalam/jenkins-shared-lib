package com.bala

class BuildWithStageApproval {
    def script

    BuildWithStageApproval(script){
        println("loading from BuildWithStageApproval class file")
        this.script = script
    }

    static BuildWithStageApproval newInstance(def script){
        return new BuildWithStageApproval(script)
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
        script.stage('Approval'){
            script.println"deploying..."

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
