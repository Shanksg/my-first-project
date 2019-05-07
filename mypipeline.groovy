pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
			bat "echo Shaked > myname.txt"
			}
		}
		stage('two'){
			steps{
				bat "type myname.txt"
				}
			}
		stage('three'){
			steps{
				bat "fsutil volume diskfree c:"
				}
			}
		stage('four'){
			steps{
				bat "move myname.txt c:/Users/ShakedLaptop/Documents"
			}
		}
	}
}
