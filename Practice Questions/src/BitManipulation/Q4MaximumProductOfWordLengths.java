package BitManipulation;

import java.util.Arrays;

/* Given a string array words, find the maximum value of length(word[i]) * length(word[j]) 
where the two words do not share common letters. 
You may assume that each word will contain only lower case letters. 
If no such two words exist, return 0.

Example 1:
Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
Return 16
The two words can be "abcw", "xtfn".

Example 2:
Given ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
Return 4
The two words can be "ab", "cd".

Example 3:
Given ["a", "aa", "aaa", "aaaa"]
Return 0
No such pair of words. */

public class Q4MaximumProductOfWordLengths {
	public static int maxProduct(String[] words) {
		int res =0;
		int [] binRep = new int[words.length];
		for(int i =0; i< words.length;i++) {// ab
			int binNum = 0 ;
			for(int j =0; j<words[i].length(); j++) { //ab
				int index = getCharacterNumber(words[i].charAt(j));
				binNum = ((1<<index) | binNum);
			}
			binRep[i] = binNum;
		}
		for(int i =0; i< binRep.length-1;i++) {
			for(int j = i+1; j< binRep.length;j++) {
				if((binRep[i] & binRep[j])== 0) {
					res = Math.max(res,words[i].length()*words[j].length());
				}
			}
			
		}
		return res;
    }
	
	public static int getCharacterNumber(Character c) {
			return Character.getNumericValue(c) - Character.getNumericValue('a');
		
		
	}
	
public static void main(String[] args) {
	//String[] words = {"ab","a","abc","d","cd","bcd","abcd"};
	String[] words = {"abcw","baz","foo","bar","xtfn","abcdef"};
	
	maxProduct(words);

}
}

/*
 *a :  [a,d] [a, cd] [a , bcd] = 3
 * i & j == 0 {
 * conside it 
 */