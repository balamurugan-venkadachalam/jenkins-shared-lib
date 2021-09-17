#!/usr/bin/env groovy
import com.bala.BuildWithStageApproval

def call() {
    BuildWithStageApproval.newInstance(this).build()
}
