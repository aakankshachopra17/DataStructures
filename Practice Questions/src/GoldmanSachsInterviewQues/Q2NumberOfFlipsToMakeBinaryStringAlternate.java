package GoldmanSachsInterviewQues;
/*
 * You are given a string s consisting only of the characters '0' and '1'. In one operation, you can change any '0' to '1' or vice versa.

The string is called alternating if no two adjacent characters are equal. For example, the string "010" is alternating, while the string "0100" is not.

Return the minimum number of operations needed to make s alternating.


 */
public class Q2NumberOfFlipsToMakeBinaryStringAlternate {
	
	 public static int minOperations(String s) {
		 return Math.min(count(s, '0'),count(s,'1'));
	 }
	 
	 public static int count(String s,Character c) {
		 int flag = 0;
		 for(int i = 0; i<s.length();i++) {
			 int curr = s.charAt(i);
			 if(curr != c) {
				 flag++;
			 }
			 c = flip(c);
		 }
		 return flag;
	 
	 }
	 
	 public static Character flip(Character c) {
		 if (c == '1') {
			 return '0';
		 } else {
			 return '1';
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "1111" ;
		String s = "10010100";
		// o/p :2
		System.out.print(minOperations(s));
		
	}
	
	
/*
 * public int minOperations(String s) {
        return Math.min(getCost(s, '0'), getCost(s, '1'));        
    }
    
    private int getCost(String s, char c) { // `c` parameter indicates whether model alternating pattern starts with '0' or '1'
        int cost = 0; // what we'll return
        for (char curChar : s.toCharArray()) {
            if (curChar != c) {
                ++cost;
            }
            c = alternate(c);
        }        
        return cost;
    }
    
}
 */

}
