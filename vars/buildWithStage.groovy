#!/usr/bin/env groovy
import com.bala.BuildWithStage

def call() {
    BuildWithStage.newInstance(this).build()
}
