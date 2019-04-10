package Solutions

object P13 {

  def encodeDirect[T](l:List[T]):List[(Int, T)] = {
    def encodeDirectRec[T](l:List[T], res:List[(Int, T)]): List[(Int, T)] = {
      if (l.isEmpty)
        res
      else {
        val (packed, next) = l.span{_ == l.head}
        encodeDirectRec(next, res:+(packed.size, packed.head))
      }
    }
    encodeDirectRec(l, List())
  }

  def main(args: Array[String]): Unit = {
    println(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
