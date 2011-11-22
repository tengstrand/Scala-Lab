package nu.tengstrand.scalalab.programminginscala

/**
 * Example of function literals.
 * Page 148 in the book "Programming in Scala, 2nd edition".
 */
object Example005FunctionLiterals {

  def main(args: Array[String]) {
    val integers = List(1,2,3,4,5)
    val odds = integers.filter(_ % 2 == 1)
    val evenFilter = (_:Int) % 2 == 0
    println(odds) // output: List(1, 3, 5)
    println(integers.filter(evenFilter))  // output: List(2, 4)
  }
}