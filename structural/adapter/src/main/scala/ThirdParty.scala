class ThirdParty //adaptee
{
  def addToCache(key: String, value: Object): Unit = {}

  def get(key: String): Object = new Object
}
