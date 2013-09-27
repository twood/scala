object rationals {
	val x = new Rational(1, 3)                //> x  : Rational = 1/3
	val y = new Rational(5, 7)                //> y  : Rational = 5/7
	val z = new Rational(3, 2)                //> z  : Rational = 3/2
	
	x                                         //> res0: Rational = 1/3
  - x                                             //> res1: Rational = 1/-3
	x - y - z                                 //> res2: Rational = -79/42
	
	y + y                                     //> res3: Rational = 10/7
	
	x < y                                     //> res4: Boolean = true
	x.max(y)                                  //> res5: Rational = 5/7

	val r = new Rational(2)                   //> r  : Rational = 2/1
	
	val r2 = new Rational(12345, 390330934)   //> r2  : Rational = 12345/390330934
}

class Rational(x: Int, y: Int) {
	require(y != 0, "denominator must be non-zero")
	private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
	// private val g = gcd(x, y)
	private val g = 1
	val numer = x / g
	val denom = y / g
	
	def this(n: Int) = this(n, 1)
	def < (that: Rational) = numer * that.denom < that.numer * denom

	def + (that: Rational) =
		new Rational(numer * that.denom + that.numer * denom,
								 denom * that.denom)
	def unary_- : Rational = new Rational(-numer, denom)
	
	def max(that: Rational) = if (this < that) that else this
	
	def -(that: Rational) = this + -that
	
	override def toString = numer / gcd(numer, denom) + "/" + denom / gcd(numer, denom)

}