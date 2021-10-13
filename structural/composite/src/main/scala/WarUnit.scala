abstract class WarUnit(protected var name: String) {
  def assignCoins(coins: Long): Unit
}

class Warrior(name: String) extends WarUnit(name) {
  var coin: Long = 0

  override def assignCoins(coins: Long): Unit = {
    this.coin = coins
  }
}

class Army(var units: List[WarUnit], name: String) extends WarUnit(name) {

  override def assignCoins(coins: Long): Unit = {
    var eachShare = coins / this.units.size
    for (warrior <- units) {
      warrior.assignCoins(eachShare)
    }
  }
}