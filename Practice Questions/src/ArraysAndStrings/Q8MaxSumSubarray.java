package ArraysAndStrings;
/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.


 */
public class Q8MaxSumSubarray {
	public static int maxSubArray(int[] arr) {
		int globalSum = arr[0];
		int currSum = arr[0];
		
		for(int i = 1;i<arr.length;i++) {
			
			currSum = Math.max(arr[i], currSum + arr[i]);
		//	System.out.println(currSum);
			
			
			if (currSum>globalSum) {
				globalSum = currSum;
			}
			
		}
		return globalSum;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,4,-1,7,8};
		int res = maxSubArray(arr);
		System.out.println(res);
		
			
		
	}

}



