package week5



object week5 {
	def squareList(xs: List[Int]): List[Int] = xs match {
		case Nil => Nil
		case y :: ys => y * y :: squareList(ys)
	}                                         //> squareList: (xs: List[Int])List[Int]
	def squareList2(xs: List[Int]): List[Int] = xs map (x => x * x)
                                                  //> squareList2: (xs: List[Int])List[Int]
	val l = List(1,2,3,4,5)                   //> l  : List[Int] = List(1, 2, 3, 4, 5)
	squareList(l)                             //> res0: List[Int] = List(1, 4, 9, 16, 25)
	squareList2(l)                            //> res1: List[Int] = List(1, 4, 9, 16, 25)
	
	def pack[T](xs: List[T]): List[List[T]] = xs match {
		case Nil => Nil
		case x :: xs1 => {
		  val (first, rest) = xs span (e => e == x)
		  first :: pack(rest)
		}
	}                                         //> pack: [T](xs: List[T])List[List[T]]
	
	pack(List("a", "a", "a", "b", "c", "c", "a"))
                                                  //> res2: List[List[String]] = List(List(a, a, a), List(b), List(c, c), List(a))
                                                  //| 
               
  def encode[T](xs: List[T]): List[(T, Int)] = {
  	pack(xs) map (e => (e.head, e.length))
  }                                               //> encode: [T](xs: List[T])List[(T, Int)]
  
  encode(List("a", "a", "a", "b", "c", "c", "a")) //> res3: List[(String, Int)] = List((a,3), (b,1), (c,2), (a,1))
  
"abccdef" groupBy ((ch: Char) => ch)              //> res4: scala.collection.immutable.Map[Char,String] = Map(e -> e, f -> f, a ->
                                                  //|  a, b -> b, c -> cc, d -> d)

	val m = "abBcccdeabc" groupBy ((ch: Char) => ch toLower)
                                                  //> m  : scala.collection.immutable.Map[Char,String] = Map(e -> e, a -> aa, b ->
                                                  //|  bBb, c -> cccc, d -> d)

	List("ab", "cd", "ef") reduceLeft ((a: String, b:String) => a + b)
                                                  //> res5: String = abcdef
}