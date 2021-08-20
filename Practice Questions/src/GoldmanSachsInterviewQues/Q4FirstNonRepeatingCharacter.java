package GoldmanSachsInterviewQues;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Given a string s, find the first non-repeating character in it and return its index.
 *  If it does not exist, return -1.


 */

public class Q4FirstNonRepeatingCharacter {

	public static int firstUniqChar(String s) {
		int index = -1;
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

		for(int i = 0; i<s.length();i++) {
			char key = s.charAt(i);
			if(hm.containsKey(key)) {
				int val = hm.get(key);
				hm.put(key, ++val);	
			} else {
				//hm = new HashMap<Character,Integer>();
				hm.put(key, 1);
			}
		}
		System.out.println("entries:");
		for(Entry<Character, Integer> entry: hm.entrySet()) {

			System.out.println(entry);
		}

		for(int i = 0; i< s.length();i++) {
			char key = s.charAt(i);
			if(hm.get(key) == 1) {
				index =  i;	
				break;
			}
		}

		return index;

	}

	public static void main(String[] args) {
		String s = "loveleetcode";
		//Output: 2
		System.out.println(firstUniqChar(s));

	}


}
