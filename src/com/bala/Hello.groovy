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
        script.println"###########################################"
    }
}
