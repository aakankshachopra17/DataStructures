package ArraysAndStrings;

public class Q9BestTimeToBuyAndSellStock {
	
	public static int maxProfit(int[] prices) {
		if(prices.length < 2){
            return 0;
        }
        int globalProfit =Integer.MIN_VALUE;
		int currProfit = 0;
		int cp = prices[0];
		int sp = prices[1];
		
		
		for(int i = 0; i< prices.length-1;i++) {
			
			cp = Math.min(cp, prices[i]);
			sp = prices[i+1];	
			currProfit  = sp - cp ;
			
			if (currProfit>globalProfit) {
				globalProfit = currProfit;
			}
		}
        if(globalProfit < 0){
            return 0;
        } else {
            return globalProfit;
        }
		        
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {1,2,4};
				//Output: 3
		
		System.out.print(maxProfit(prices));

	}

}
