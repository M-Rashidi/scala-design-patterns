abstract class Logistics {
  def create(kind: String): Transport
}

class LandLogistics extends Logistics {
  override def create(kind: String) = new Truck
}

class SeaLogistics extends Logistics {
  override def create(kind: String) = new Ship
}