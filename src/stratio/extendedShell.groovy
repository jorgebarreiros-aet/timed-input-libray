//  src/stratio.extendedShell.groovy

package stratio


def tssh(command){
	def commandOutput
	timestamps {
		commandOutput = sh(	script: "${command}",
							returnStdout: true).trim()
	}	
	echo commandOutput
	}

def version() {return '1.0'}

static def extendedShellVersion(){
	return '1.0'
}
