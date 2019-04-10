package Solutions

object P17 {

  def split[T](n:Int, list:List[T]):(List[T], List[T]) = {
    def splitRec[T](n:Int, l:List[T], res:List[T]):(List[T], List[T]) = (n,l) match {
      case (_,Nil) => (res, l)
      case (1, head::tail)  => (res:+head, tail)
      case (_, head::tail) => splitRec(n-1, tail, res:+head)
    }
    if (n == 0) (Nil, list) else splitRec(n,list, Nil)
  }

  def splitFun[T](n:Int, list:List[T]):(List[T], List[T]) = (list.take(n),list.drop(n))

  def main(args: Array[String]): Unit = {
    println(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    println(splitFun(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}
