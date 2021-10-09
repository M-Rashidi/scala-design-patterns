class OneAdapter extends CacheManager {
  private val adaptee = new ThirdParty

  override def add(key: String, value: Object): Unit = adaptee.addToCache(key, value)

  override def get[T](key: String): T =adaptee.get(key).asInstanceOf[T]
}