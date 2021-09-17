package com.bala

class BuildWithStageApproval {
    def static script

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
        script.stage('Approval'){
            steps: steps()
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

    static private steps(){
        //script.input "Deploy to prod?"
        def deploymentDelay = script.input id: 'Deploy', message: 'Deploy to production?', submitter: 'bala,admin', parameters: [script.choice(choices: ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24'], description: 'Hours to delay deployment?', name: 'deploymentDelay')]
        sleep time: deploymentDelay.toInteger(), unit: 'HOURS'
    }
}
