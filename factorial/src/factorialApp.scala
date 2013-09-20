object factorialApp extends App {
	def factorial(n: Int) : Int = {
	  def fact2(n: Int, product: Int): Int = {
	    if (n == 0) product else fact2(n - 1, product * n)
	  }
	  fact2(n, 1)
	}
	
	println(factorial(5))
}