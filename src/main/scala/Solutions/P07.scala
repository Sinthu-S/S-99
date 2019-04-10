package Solutions

object P07 {

  def flatten(l: List[Any]): List[Any] = l flatMap {
    case ms:List[_] => flatten(ms)
    case e => List(e)
  }

  def main(args: Array[String]): Unit = {
    println(flatten(List(List(1, 1), List(3, List(5, 8)))))
  }
}
