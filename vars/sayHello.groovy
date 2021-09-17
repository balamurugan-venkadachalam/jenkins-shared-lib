#!/usr/bin/env groovy
import com.bala.Hello

def call(String name = 'test') {
    echo "Hello, ${name}."
}
