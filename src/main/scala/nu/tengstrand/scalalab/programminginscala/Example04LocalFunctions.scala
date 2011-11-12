package nu.tengstrand.scalalab.programminginscala

/**
 * Shows how to use local functions to simplify the code.
 * Page 144 in the book "Programming in Scala, 2nd edition".
 */
object Example04LocalFunctions {

  def main(args: Array[String]) {
    println(format(1,2,3,4, 10)) // output: (10:20)(30:40)
  }

  /**
   * The outer variable 'factor' is accessible from the local method multiply.
   * This technique can be used to simplify a function/method.
   */
  def format(a1: Int, a2: Int, b1: Int, b2: Int, factor: Int) = {
    def multiply(value: Int) = value * factor
    def concat(value1: Int, value2: Int) = "(" + multiply(value1) + ":" + multiply(value2) + ")"

    concat(a1,a2) + concat(b1,b2)
  }
}
