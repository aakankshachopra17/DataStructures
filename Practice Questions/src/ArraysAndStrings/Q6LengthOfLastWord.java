package ArraysAndStrings;

import java.util.*;

public class Q6LengthOfLastWord {

	 public static int lengthOfLastWord(String s) {
		 int len = s.length();
		 Stack<Character> stack = new Stack<Character>();
		int flag = 0;
		 
		 for(int i = len-1; i>=0; i--) {
			 if(s.charAt(i) == ' ' && flag !=0) {
				 break;
			 }
			 
			if(s.charAt(i) != ' ') {
				  flag = 1;
				 stack.push(s.charAt(i)) ;	
			 }
			 
		 }
		return stack.size();
//		 while(!stack.isEmpty()) {
//			res   =  res + stack.pop();
//		 }
//		 return res.length()-1;
	        
	    }
	 public static void main(String[] args) {
		String s = "   fly me   to   the moon  ";
		System.out.print(lengthOfLastWord(s));
		 
	 }
}
