trait Transport {
  def deliverBy(): String
}

class Ship extends Transport {
  override def deliverBy(): String = "Ship deliver logistics by Sea."
}

class Truck extends Transport {
  override def deliverBy(): String = "Truck deliver logistics by Road."
}

