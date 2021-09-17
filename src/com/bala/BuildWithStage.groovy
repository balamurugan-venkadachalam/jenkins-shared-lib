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
        script.stage('build'){
            script.println"build stage"
        }
        script.stage('deploy'){
            script.println"deploy stage"
        }
        script.stage('release'){
            script.println"release stage"
        }
        script.println"###########################################"
        script.println"Job completed"
        script.println"###########################################"

    }
}
