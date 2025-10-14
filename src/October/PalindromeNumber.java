package October;

/**
 * 15/10/2025
 *
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 *
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 *
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 * Run time: 6ms
 * Memory: 44.22MB
 *
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        String xToString = String.valueOf(x);
        //String xReverse = new StringBuffer(xToString).reverse().toString();

        int count = 0;
        boolean flag = true;

        while(count <= xToString.length()-1){
            if(xToString.charAt(count) != xToString.charAt((xToString.length()-1 ) - count)){
                flag = false;
            }
            ++count;
        }

        return flag;
    }
}
