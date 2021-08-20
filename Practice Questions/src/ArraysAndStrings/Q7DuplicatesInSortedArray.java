package ArraysAndStrings;

/*
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element appears only once. 
 * The relative order of the elements should be kept the same
 */

public class Q7DuplicatesInSortedArray {
	
	
	 public static int removeDuplicates(int[] nums) {
		 int curr = 0;
		 int len = nums.length;
		 
		 for(int i = 1; i<len ; i++) {
			
			 if(nums[curr] != nums[i]) {
				 nums[]
			 }
			 }
		 return curr;
	        
	    }
	
public static void mai(String[] args) {
	int[] nums = {0,0,1,1,1,2,2,3,3,4};
			//Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
	System.out.print(removeDuplicates(nums));
}
}
