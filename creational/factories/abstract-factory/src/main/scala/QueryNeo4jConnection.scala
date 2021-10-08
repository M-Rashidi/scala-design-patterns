class QueryNeo4jConnection extends QueryConnection {
  override def getName(): String = "QueryNeo4jConnection"

  override def executeQuery(query: String): Unit = {
    System.out.println(s"Executing the query '$query' the Neo4j.")
  }
}