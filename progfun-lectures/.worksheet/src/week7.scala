object week7 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
 	def from(n: Int): Stream[Int] = n #:: from(n + 1);System.out.println("""from: (n: Int)Stream[Int]""");$skip(21); 
 	val nats = from(0);System.out.println("""nats  : Stream[Int] = """ + $show(nats ));$skip(28); 
 	val m4s = nats map(_ * 4);System.out.println("""m4s  : scala.collection.immutable.Stream[Int] = """ + $show(m4s ));$skip(27); val res$0 = 
 	
 	(m4s take 100).toList;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(105); 
 
 	
 	
 	def sieve(s: Stream[Int]): Stream[Int] =
 	  s.head #:: sieve(s.tail filter (_ % s.head != 0));System.out.println("""sieve: (s: Stream[Int])Stream[Int]""");$skip(30); 

	val primes = sieve(from(2));System.out.println("""primes  : Stream[Int] = """ + $show(primes ));$skip(28); val res$1 = 
	
	(primes take 100).toList;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(169); 

	def sqrtStream(x: Double): Stream[Double] = {
		def improve(g: Double) = (g + x / g) / 2
		lazy val guesses: Stream[Double] = 1 #:: (guesses map improve)
		guesses
	};System.out.println("""sqrtStream: (x: Double)Stream[Double]""");$skip(31); val res$2 = 
	sqrtStream(4).take(10).toList;System.out.println("""res2: List[Double] = """ + $show(res$2))}
}
