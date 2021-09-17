
class Hello {
    def script
    Hello(script){
        println("loading from Hello class file")
        this.script = script
    }

    def sayHello(){
        script.println"###########################################"
        script.println"Hello Bala"
        script.println"###########################################"
    }
}
