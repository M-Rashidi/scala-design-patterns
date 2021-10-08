trait QueryConnection {
  def getName(): String

  def executeQuery(query: String): Unit
}
