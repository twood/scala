package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (r == 0) 1
    else if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    val left = '('
    val right = ')'
      
    def balancedScan(chars: List[Char], parenCount: Int): Boolean = {
      def isOpenParen() = parenCount > 0
      def leftParen() = parenCount + 1
      def rightParen() = parenCount - 1
      def isNoParen() = parenCount == 0
      
      if (chars.isEmpty) 
        isNoParen()
      else {
        val ch = chars.head
        val rest = chars.tail
        if (ch == left)
          balancedScan(rest, leftParen)
        else if (ch == right)
          isOpenParen && balancedScan(rest, rightParen)
        else
          balancedScan(rest, parenCount)
      }
    }
    balancedScan(chars, 0)
  }


  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    println("countChange: " + money.toString + ", " + coins.toString)
    if (coins.isEmpty) 0
    else if (coins.tail.isEmpty) {
      if (money == coins.head) 1 else 0
    }
    else
      countChange(money, List(coins.head)) + countChange(money - coins.head, coins.tail)
  }
}
