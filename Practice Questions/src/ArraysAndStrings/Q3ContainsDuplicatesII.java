package ArraysAndStrings;

import java.util.HashMap;

//Given an array of integers and an integer k, 
//find out whether there are two distinct indices i and 
//j in the array such that nums[i] = nums[j] and 
//the absolute difference between i and j is at most k.

public class Q3ContainsDuplicatesII {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i = 0; i< nums.length;i++) {
			if(!hm.containsKey(nums[i])) {
				hm.put(nums[i],i);
			} else {
				int val = hm.get(nums[i]);
				if(i- val <=k) {
					return true;
				} else {
					hm.put(nums[i],i);
				}
			}
		}
		return false;

	}
	public static void main(String[] args) {
			int[] nums = {1,0,1,1};
			int k = 1;

//		int[] nums = {1,2,3,1,2,3};
//		int k = 2;
		
//		int[] nums = {1,2,3,1};
//		int k = 3;
		
		System.out.print(containsNearbyDuplicate(nums,k));

	}
}
