package BitManipulation;

//Write a function that takes an unsigned integer and returns the number of ’1' 
//bits it has (also known as the Hamming weight).

//For example, the 32-bit integer ’11' has binary representation 
//00000000000000000000000000001011, so the function should return 3.

public class Q5NumberOfOneBits {

	public static int countSetBits(int n){
		int count =0 ;
		while(n!= 0) {
			n = n & (n-1);
			count++;
		}
		//System.out.println(count);
		return count;
		
	}
	
	public static void main(String[] args) {
		countSetBits(11);
	}
}
