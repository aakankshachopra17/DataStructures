package ArraysAndStrings;
/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day, 
 * and an integer fee representing a transaction fee.

Find the maximum profit you can achieve. 
You may complete as many transactions as you like, 
but you need to pay the transaction fee for each transaction.
 */
public class Q11BestTimeToBuyAndSellStockWithTransactionFee {
	
	
	public static int maxProfit(int[] prices, int fee) {
		
	    int sell = 0, buy = -prices[0];
	    
	    	for(int i =0; i< prices.length;i++) {
	    		int sellOld = sell;
	    		sell = Math.max(sell, prices[i]+ buy - fee);
	 	        buy = Math.max(buy, sellOld - prices[i]);
	    	}
	    return sell;
	}

	public static void main(String[] args) {
		int[] prices = {1,3,2,8,4,9};
		int fee = 2;
		System.out.print(maxProfit(prices,fee));

	}

}
