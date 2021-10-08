trait DbQueryConnectionFactory {
  def connect(): QueryConnection
}

class SqlServerFactory extends DbQueryConnectionFactory {
  override def connect(): QueryConnection = new QuerySqlServerConnection
}

class Neo4jFactory extends DbQueryConnectionFactory {
  override def connect(): QueryConnection = new QueryNeo4jConnection
}