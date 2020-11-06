pipeline {
  agent {
    label 'master' 
  }
  options { 
    disableConcurrentBuilds()
    timestamps()     
  }
  parameters {
    string defaultValue: 'Monza', description: 'desc', name: 'Project', trim: true

    choice(
      choices: 'Build\nTest\nDeploy',
      description: 'Start Plan From',
      name: 'run_from'
    )
    choice(
      choices: 'geeth\nshaan',
      description: 'Select geeth or shaan',
      name: 'NameType'
    )
  }

  stages {
    stage('Clean Directory') {
      steps {
        sh script: "echo Clean Directory"       
      }
    }
    stage('Build') {
      steps {
        sh script: "echo Build"       
      }
    }
    stage('Test') {
      steps {
        sh script: "echo Test"       
      }
    }
    stage('Deploy') {
      steps {
        sh script: "echo Deploy"       
      }
    }
  }
}
