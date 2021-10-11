abstract class PricingStrategy(protected var calculationStrategy: CalculationStrategy) {
  def calculate(price: Double): Double = {
    val value = calculationStrategy.calculate(price)
    ApplyStrategy(value, price)
  }

  protected def ApplyStrategy(value: Double, price: Double): Double
}


class MarkupStrategy(calculationStrategy: CalculationStrategy) extends PricingStrategy(calculationStrategy) {
  override protected def ApplyStrategy(value: Double, price: Double): Double = value + price
}
class DiscountStrategy(calculationStrategy: CalculationStrategy) extends PricingStrategy(calculationStrategy) {
  override protected def ApplyStrategy(value: Double, price: Double): Double = value - price
}



