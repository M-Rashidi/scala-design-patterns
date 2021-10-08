class DbClient(connectionFactory: DbQueryConnectionFactory) {
  def executeQuery(query: String): Unit = {
    val connection = connectionFactory.connect()
    connection.executeQuery(query)
  }
}