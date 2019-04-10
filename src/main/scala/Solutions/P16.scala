package Solutions

object P16 {

  def drop[T](n:Int, l:List[T]):List[T] = {
    def dropRec[T](m:Int, l:List[T], res:List[T]):List[T] = (m, l) match {
      case (_,Nil) => res
      case (1,_::tail) =>  dropRec(n,tail, res)
      case (_,head::tail) => dropRec(m-1, tail, res:+head)
    }
    dropRec(n, l, List())
  }

  def main(args: Array[String]): Unit = {
    println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}
