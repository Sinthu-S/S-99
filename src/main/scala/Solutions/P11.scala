package Solutions

import Solutions.P09.pack
import Solutions.P10.encode

object P11 {
  def encodeModified[T](l:List[T]):List[Any] = pack(l).map {e => if (e.size > 1) (e.size, e.head) else e.head }

  def encodeModified2[T](l:List[T]):List[Any] = encode(l).map {e => if (e._1 > 1) e else e._2}

  def main(args: Array[String]): Unit = {
    println(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
    println(encodeModified2(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
