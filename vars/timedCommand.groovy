// vars/timedCommand.groovy
def setCommand(commandToRun) {
cmd = commandToRun
}
def getCommand() {
cmd
}
def runCommand() {
timestamps {
cmdOut = sh (script:"${cmd}", returnStdout:true).trim()
}
}
def getOutput() {
cmdOut
}

def call (String cmd) {
timestamps {
cmdOutput = echo sh (script:"${cmd}", returnStdout:true).trim()
}