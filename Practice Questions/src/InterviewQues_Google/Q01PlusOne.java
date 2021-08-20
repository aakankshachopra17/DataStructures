package InterviewQues_Google;

//Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
//
//The digits are stored such that the most significant digit is at the head of the list,
//and each element in the array contain a single digit.
//
//You may assume the integer does not contain any leading zero, except the number 0 itself.
//
//Example 1:
//
//Input: [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Example 2:
//
//Input: [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.

public class Q01PlusOne {
	public static int[] plusOneNumber(int[] num) {
		
		int lastIndex =  num.length-1;
		
		 for(int i = lastIndex; i>= 0; i--) { // 9,9
			 if(num[i] < 9) { 
/* 
* for simple use cases eg: 1,2,3
*  where we are concerned only about the lastIndex.
*  Hence, we add +1 there and return.
*/
				 num[i]++;
				 return num;		 
			 } 
			 num[i]  = 0;
//if we have 9, we make it 0
		 }
			 int res[] = new int[num.length+1]; 
/* 
* in case a two digit number has to become a three digit number
* eg: 99 -> 100
*/
			 res[0] = 1;
			 return res;
		 }
  
	

	public static void main(String[] args) {
		//int[] num = {1,2,3};
		int[] num = {9,9};
	    int[] res  = plusOneNumber(num);	
	    for(Integer itr : res) {
			System.out.print(itr);
		}
	
	
}
}
