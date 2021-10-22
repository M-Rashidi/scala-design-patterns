sealed abstract class BrushSize

case object Thin extends BrushSize

case object Medium extends BrushSize

case object Thick extends BrushSize

class Pen(val color: String, val size: BrushSize) {
  def draw(content: String): Unit = System.out.println("Drawing THIN content in color : " + color)
}

import scala.collection.mutable.Map

object PenFactory {
  val cache = Map.empty[String, Pen]

  def getThickPen(color: String): Pen = cache.getOrElseUpdate(color,
    new Pen(color, Thick))


  def getThinPen(color: String): Pen = cache.getOrElseUpdate(color,
    new Pen(color, Thin))

  def getMediumPen(color: String): Pen = cache.getOrElseUpdate(color,
    new Pen(color, Medium))
}