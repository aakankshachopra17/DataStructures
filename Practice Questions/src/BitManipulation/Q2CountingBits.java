package BitManipulation;
/*Given a non negative integer number num. 
 * For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their 
 * binary representation and return them as an array.
 * Example:
 * For num = 5 you should return [0,1,1,2,1,2].
 */


public class Q2CountingBits {
	
	 public static int[] countBits(int n) {
		 int[] res = new int[n+1];
		 
		 
		 
		 for(int i =0;i<=n;i++) {
			 res[i] = Integer.bitCount(i);
			 System.out.println( res[i]);
		 }
		 
		
		 return res;
	        
	    }
	
public static void main(String[] args) {
	countBits(5);
}
}
