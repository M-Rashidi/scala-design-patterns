class QuerySqlServerConnection extends QueryConnection {
  override def getName(): String = "QuerySqlServerConnection"

  override def executeQuery(query: String): Unit = {
    System.out.println(s"Executing the query '$query' the SqlServer.")
  }
}
