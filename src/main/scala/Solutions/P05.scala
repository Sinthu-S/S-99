package Solutions

object P05 {

  def reverse[T](l:List[T]):List[T] = {
    def reverseRec(r:List[T], l:List[T]):List[T] = l match {
      case Nil => r
      case head :: tail => reverseRec(head :: r, tail)
    }
    reverseRec(Nil, l)
  }

  def reverseFun[T](l:List[T]):List[T] = l.foldLeft(List[T]()) {(res, head) => head::res }

  def main(args: Array[String]): Unit = {
    println(reverse((List(1, 1, 2, 3, 5, 8))))
    println(reverseFun((List(1, 1, 2, 3, 5, 8))))

  }
}
