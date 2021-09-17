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
        script.stage('build'){
            script.println"compiling..."
        }
        script.stage('test'){
            script.println"testing..."
        }

        script.stage('deploy'){
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
