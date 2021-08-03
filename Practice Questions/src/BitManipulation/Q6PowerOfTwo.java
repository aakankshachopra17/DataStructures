package BitManipulation;
/*Given an integer, write a function to determine if it is a power of two.

Example 1:

Input: 1
Output: true
Example 2:

Input: 16
Output: true
Example 3:

Input: 218
Output: false
*/

public class Q6PowerOfTwo {
	  public boolean isPowerOfTwo(int n) {
	
	 if(n <= 0) {
			return false;
		}
     
     int s =  n & n-1;	
		if (s == 0) {
         return true;
     }
     return false;
	
	  }
}
