package stratio

def tssh(command-to-run){
	def commandOutput
	steps.timestamps {
		commandOutput = steps.sh(script: "${<command-to-run>}",
		returnStdout: true).trim()
	}	
	steps.echo commandOutput
	}
}