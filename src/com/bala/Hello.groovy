package com.bala
class Hello {
    def script
    Hello(script){
        println("loading from Hello class file")
        this.script = script
    }

    static Hello newInstance(def script){
        return new Hello(script)
    }

    def sayHello(){
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
