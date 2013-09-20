object factorial {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(158); 
  def factorial(n: Int): Int = {
  	def loop(acc: Int, n: Int): Int =
  	  if (n == 0) acc
  	  else loop(n * acc, n - 1)
  	loop(1, n)
 	};System.out.println("""factorial: (n: Int)Int""");$skip(18); val res$0 = 
 	
 	factorial(0);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
 	factorial(1);System.out.println("""res1: Int = """ + $show(res$1));$skip(15); val res$2 = 
 	factorial(6);System.out.println("""res2: Int = """ + $show(res$2))}
}
