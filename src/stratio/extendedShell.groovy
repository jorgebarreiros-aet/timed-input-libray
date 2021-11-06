package stratio

class extendedShell implements Serializable{
def steps

extendedShell(steps){this.steps=steps}

tssh(command-to-run){
	def commandOutput
	steps.timestamps {
		commandOutput = steps.sh(script: "${<command-to-run>}",
		returnStdout: true).trim()
	}	
	steps.echo commandOutput
}
}