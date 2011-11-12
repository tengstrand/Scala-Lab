package nu.tengstrand.scalalab.programminginscala

/**
 * Sid 148. Exempel på när man måste ha med typen
 * för en viss parameter i en "function literal".
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