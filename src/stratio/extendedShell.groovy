//  src/stratio.extendedShell.groovy

package stratio

const String VERSION='1.0'

def tssh(command){
	def commandOutput
	timestamps {
		commandOutput = sh(	script: "${command}",
							returnStdout: true).trim()
	}	
	echo commandOutput
	}

def version() {return VERSION}

static def extendedShellVersion(){
	return VERSION
}
