package Solutions

object P09 {

  def pack[T](l: List[T]): List[List[T]] = {
    l.foldLeft(List[List[T]]()) {(r, h) => if (r.isEmpty || r.last.last != h) r:+List(h) else r.init:+(r.last:::List(h)) }
  }

  def packRec[T](l:List[T]) : List[List[T]] = {
    def packTailRec[T](l:List[T], res:List[List[T]]): List[List[T]] = {
      if (l.isEmpty)
        res
      else {
        val (packed, next) = l.span{_ == l.head}
        packTailRec(next, res:+packed)
      }
    }
    packTailRec(l, List())
  }

  def main(args: Array[String]): Unit = {
    println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
    println(packRec(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
