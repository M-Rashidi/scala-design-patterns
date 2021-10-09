trait CacheManager {
  def add(key: String, value: Object): Unit

  def get[T](key: String): T
}



