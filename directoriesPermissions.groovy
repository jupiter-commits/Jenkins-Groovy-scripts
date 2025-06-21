jenkinsPath = System.getenv("JENKINS_HOME")
relativePath = "/workspace"

def dirPath = new File(jenkinsPath + relativePath)
dirList = []

dirPath.eachDir() { dir ->
  dirList << dir
}

dirList.each {
  println it.path
  println it.canWrite()
  println java.nio.file.Files.getOwner(it.toPath())
}