package nu.tengstrand.scalalab.programminginscala

/**
 * Example how to use symbols.
 * Page 80 in the book "Programming in Scala, 2nd edition".
 */
object Ëxample02Symbol {
  def main(args: Array[String]) {
    new Example().print('KalleKanin) // output: Value: KalleKanin
  }
}

class Example {
  def print(value: Symbol) {
    println("Value: " + value.name)
  }
}