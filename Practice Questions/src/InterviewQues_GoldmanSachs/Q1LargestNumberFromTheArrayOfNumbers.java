package InterviewQues_GoldmanSachs;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

/*
 * Given an array of numbers, arrange them in a way that yields the largest value.
 *  For example, if the given numbers are {54, 546, 548, 60}, 
 *  the arrangement 6054854654 gives the largest value. 
 *  And if the given numbers are {1, 34, 3, 98, 9, 76, 45, 4}, 
 *  then the arrangement 998764543431 gives the largest value.
 * 
 */

public class Q1LargestNumberFromTheArrayOfNumbers {

	public static String largestNumber(Vector<String> arr) {
		String largestNum = "";

		Collections.sort(arr, new Comparator<String>()
		{

			@Override
			public int compare(String X, String Y) {
				String XY = X + Y;
				String YX = Y + X;

				return XY.compareTo(YX) > 0 ? -1 : 1;
			}
		});
		Iterator itr = arr.iterator();
		while(itr.hasNext()) {
			largestNum += itr.next();
			//System.out.print(largestNum);
		}
		
		return largestNum;
	}

	public static void main(String[] args) {

		int[] nums = {3,30,34,5,9}; // Output: "9534330"
		Vector<String> arr = new Vector<String>();
		for(int i = 0 ; i<nums.length;i++)
			arr.addElement(Integer.toString(nums[i]));

		System.out.print(largestNumber(arr));
	}
}
