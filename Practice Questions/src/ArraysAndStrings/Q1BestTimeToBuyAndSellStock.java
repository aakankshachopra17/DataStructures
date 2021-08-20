package ArraysAndStrings;
//Say you have an array for which the ith element is the price of a given stock on day i.

//If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

//Example 1:
//Input: [7, 1, 5, 3, 6, 4]
//Output: 5

//max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
//Example 2:
//Input: [7, 6, 4, 3, 1]
//Output: 0

//In this case, no transaction is done, i.e. max profit = 0.
//[NOT DONE]
public class Q1BestTimeToBuyAndSellStock { 
	public static int calculateMaxProfit(int[] stockPrices) {
	int globalProfit,currentProfit;
	currentProfit = stockPrices[0];
	globalProfit = Integer.MIN_VALUE;
	int cp = stockPrices[0];
	int sp = stockPrices[1];
	
	for(int i=0;i<stockPrices.length-1;i++) {
		
		cp = Math.min(cp, stockPrices[i]);
		sp = stockPrices[i+1];
		currentProfit = sp - cp;
		
		
		if(currentProfit > globalProfit) {
			globalProfit = currentProfit;
		}
	}
	
	if(globalProfit>0) {
		return  globalProfit;
	} else {
		return 0;
	}

	
	}
	
	public static void main(String[] args) {
		// int [] arr = {7,1,5,3,6,4};
		 int [] arr = {7, 6, 4, 3, 1};
		// int [] arr = {7,6,9,4,3,1};
		// int [] arr = {3,6,9,12,1};
	//	int [] arr = {12,10,9,8,1,7,14}; //13
		 //int [] arr = {1,6,2,3};//5
		 
		
		 System.out.print(calculateMaxProfit(arr));
	
	}
}
