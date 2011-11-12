package nu.tengstrand.scalalab.programminginscala

/**
 * Example how to use unary operators on own classes
 * Page 83 in the book "Programming in Scala, 2nd edition".
 */
object Example03UnaryOperatorSyntax {
  def main(args: Array[String]) {
    val value = new MyType(123)
    println(-value) // output: -123
    println(value.unary_-); // output: -123
  }
}

class MyType(value: Int) {
  def unary_- = new MyType(-value)
  override def toString = value.toString
}