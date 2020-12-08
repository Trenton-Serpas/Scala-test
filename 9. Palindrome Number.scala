import scala.collection.mutable.ArrayBuffer 
object Solution {
    def isPalindrome(x: Int): Boolean = {
        if(x < 0)
            return false
        
        var palindrome = ArrayBuffer[Int]()
        
        var xCopy: Int = x
        while(xCopy > 0) {
            palindrome += xCopy % 10
            xCopy = (xCopy / 10)
        }

        for(i <- 0 until palindrome.length / 2) {
            if(palindrome(i) != palindrome(palindrome.length - i - 1))
                return false
        }
        
        return true
    }
}