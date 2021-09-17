#!/usr/bin/env groovy
import com.bala.Hello

def call() {
    Hello.newInstance(this).sayHello()
}
