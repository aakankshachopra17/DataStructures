package BitManipulation;
/*
 *The Hamming distance between two integers is the number of positions at which the 
 *corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

 Note: 0 ≤ x, y < 2^31.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
 1   (0 0 0 1)
 4   (0 1 0 0)
        ↑   ↑

// The above arrows point to positions where the corresponding bits are different.
 */
public class Q3HammingDistance {
	 public static int hammingDistance(int x, int y) {
		 int  res = 0;
		 res = Integer.bitCount(x ^ y);
	    
		 System.out.println( res);
		  return res;
	 }
	      
	 public static void main(String[] args) {
		 hammingDistance(1,4);

}
}
