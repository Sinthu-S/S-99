package Solutions

import scala.annotation.tailrec

// P04 (*) Find the number of elements of a list.

object P04 {

  def length[T](l: List[T]):Int = {
    @tailrec
    def lengthRec[T](n:Int, l:List[T]):Int = l match {
    case Nil => n
    case _::tail => lengthRec(n+1, tail)
  }
    lengthRec(0, l)
  }

  def main(args: Array[String]): Unit = {
    println(length((List(1, 1, 2, 3, 5, 8))))
  }

}
