package nu.tengstrand.scalalab.programminginscala

/**
 * Example of implicit conversion and rich wrappers.
 * Page 94, 212 in the book "Programming in Scala, 2nd edition".
 */
object Example006ImplicitConversion {

  def main(args: Array[String]) {
    println(1 to 3)
    println(4.to(6))
    println(Predef.intWrapper(7).to(9))
   }
}