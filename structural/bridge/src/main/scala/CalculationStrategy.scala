trait CalculationStrategy {
  def calculate(price: Double): Double
}

class AmountStrategy (val amount: Double) extends CalculationStrategy {
  override def calculate(price: Double): Double = amount
}
class PercentStrategy (val percent: Double) extends CalculationStrategy {
  override def calculate(price: Double): Double = (percent * price) / 100
}
