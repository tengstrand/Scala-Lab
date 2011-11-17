package nu.tengstrand.scalalab.programminginscala

/**
 * Example of 'function literal'
 * Page 148 in the book "Programming in Scala, 2nd edition".
 */
object Example005FunctionLiterals {

  def main(args: Array[String]) {
    val integers = List(1,2,3,4,5)
    val odds = integers.filter(_ % 2 == 1)
    val evenFilter = (_:Int) % 2 == 0
    println(odds)
    println(integers.filter(evenFilter))
  }
}