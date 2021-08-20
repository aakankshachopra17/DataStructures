package GoldmanSachsInterviewQues;
/*
Input: s = "111000"
Output: 2
Explanation: Use the first operation two times to make s = "100011".
Then, use the second operation on the third and sixth elements to make s = "101010".
 */


public class Q6NumberOfFlipsToMakeBinaryStringAlternateII {

}


/*
public int minFlips(String s) {
        int n = s.length(), res = Integer.MAX_VALUE, t = 0;        
        for (int i = 0; i < 2*n; i++)  {
            if (s.charAt(i%n) - '0' != (i % 2 != 0 ? 0 : 1) ) t++; // add is i
            if (i >= n && s.charAt(i%n) - '0' != (i%n % 2 != 0 ? 0 : 1)) t--; // minus is i%n
            if (i >= n-1)  res = Math.min(res, Math.min(t, n-t));             
        }
        return res;
    }
*/