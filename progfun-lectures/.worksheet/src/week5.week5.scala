package week5



object week5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(149); 
	def squareList(xs: List[Int]): List[Int] = xs match {
		case Nil => Nil
		case y :: ys => y * y :: squareList(ys)
	};System.out.println("""squareList: (xs: List[Int])List[Int]""");$skip(65); 
	def squareList2(xs: List[Int]): List[Int] = xs map (x => x * x);System.out.println("""squareList2: (xs: List[Int])List[Int]""");$skip(25); 
	val l = List(1,2,3,4,5);System.out.println("""l  : List[Int] = """ + $show(l ));$skip(15); val res$0 = 
	squareList(l);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(16); val res$1 = 
	squareList2(l);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(172); 
	
	def pack[T](xs: List[T]): List[List[T]] = xs match {
		case Nil => Nil
		case x :: xs1 => {
		  val (first, rest) = xs span (e => e == x)
		  first :: pack(rest)
		}
	};System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(49); val res$2 = 
	
	pack(List("a", "a", "a", "b", "c", "c", "a"));System.out.println("""res2: List[List[String]] = """ + $show(res$2));$skip(111); 
               
  def encode[T](xs: List[T]): List[(T, Int)] = {
  	pack(xs) map (e => (e.head, e.length))
  };System.out.println("""encode: [T](xs: List[T])List[(T, Int)]""");$skip(53); val res$3 = 
  
  encode(List("a", "a", "a", "b", "c", "c", "a"));System.out.println("""res3: List[(String, Int)] = """ + $show(res$3));$skip(40); val res$4 = 
  
"abccdef" groupBy ((ch: Char) => ch);System.out.println("""res4: scala.collection.immutable.Map[Char,String] = """ + $show(res$4));$skip(59); 

	val m = "abBcccdeabc" groupBy ((ch: Char) => ch toLower);System.out.println("""m  : scala.collection.immutable.Map[Char,String] = """ + $show(m ));$skip(69); val res$5 = 

	List("ab", "cd", "ef") reduceLeft ((a: String, b:String) => a + b);System.out.println("""res5: String = """ + $show(res$5))}
}
