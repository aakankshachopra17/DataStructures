package ArraysAndStrings;
/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.

Find the maximum profit you can achieve. 
You may complete as many transactions as you like 
(i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions simultaneously 
(i.e., you must sell the stock before you buy again).
 */
public class Q10BestTimeToBuyAndSellStockII {
	
	
	public static int maxProfit(int[] prices) {
		    int profit = 0;
		    for(int i = 0; i < prices.length-1; i++){
		    	int cp = prices[i];
		    	int sp = prices[i+1];
		        if(sp>cp){
		        	profit += sp-cp;
		        }
		    }
		    return profit;
	}

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		
		System.out.print(maxProfit(prices));
		/*
		 * Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
		 */

	}

}




