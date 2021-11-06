//  src/stratio.extendedShell.groovy

package stratio

def VERSION_NUMBER='1.0'

def tssh(command){
	def commandOutput
	timestamps {
		commandOutput = sh(	script: "${command}",
							returnStdout: true).trim()
	}	
	echo commandOutput
	}

def version() {return VERSION_NUMBER}

static def extendedShellVersion(){
	return VERSION_NUMBER
}
