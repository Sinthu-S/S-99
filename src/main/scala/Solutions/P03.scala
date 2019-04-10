package Solutions

import scala.annotation.tailrec

// P03 (*) Find the Kth element of a list.

object P03 {

  def nth[T](n:Int, l:List[T]):T = {
    @tailrec
    def nthRec[T](n:Int, l:List[T]):T = (n,l) match {
      case (0, head::_) => head
      case (n, _::tail) => nthRec(n-1, tail)
      case (_,Nil) => throw new NoSuchElementException("Out of range")
    }
    if (n < 0)
      throw new NoSuchElementException("Out of range")
    else
      nthRec(n, l)
  }


  def main(args: Array[String]): Unit = {
    println(nth(2, (List(1, 1, 2, 3, 5, 8))))
  }
}
