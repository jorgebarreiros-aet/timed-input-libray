package stratio

class extendedShell implements Serializable{
def tssh(command-to-run){
	def commandOutput
	timestamps {
		commandOutput = sh(script: "${<command-to-run>}",
		returnStdout: true).trim()
	}	
	echo commandOutput
}
}