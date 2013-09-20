object factorial {
  def factorial(n: Int): Int = {
  	def loop(acc: Int, n: Int): Int =
  	  if (n == 0) acc
  	  else loop(n * acc, n - 1)
  	loop(1, n)
 	}                                         //> factorial: (n: Int)Int
 	
 	factorial(0)                              //> res0: Int = 1
 	factorial(1)                              //> res1: Int = 1
 	factorial(6)                              //> res2: Int = 720
}