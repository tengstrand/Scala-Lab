package nu.tengstrand.scalalab.programminginscala

/**
 * How to build your own List/Array classes.
 */
object Example01ListSyntax {
  def main(args: Array[String]) {
    val myArray = new MyArray()
    println(myArray(0)) // output: 1
    println(myArray.apply(1)); // output: 2
  }
}

class MyArray {
  val array = Array(1,2,3)

  def apply(i: Int) = array(i)
}
