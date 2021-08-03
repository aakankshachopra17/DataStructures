package BitManipulation;

public class BasicBitwiseOperations {
	
	
	public static String checkEvenOdd(int num) {
		int binNum = Integer.parseInt(Integer.toBinaryString(num));
		System.out.println("The number is  "+ binNum);//0101
		
		/*  If the last digit of the Binary representation of the number is 
		    '1',then it's Odd.
		    '0',then it's Even. */
		
	    //Approach : If we AND the number with 1, we can infer the last digit.
		
		if ((binNum & 1) == 1) {
			return "Odd";
		} else {
			return "Even";
		}
		
	}
	
	public static int multiplyBy2NTimes(int num, int n) {
		/*  We can  left shift  the number n times,
		    to get  multiplication of the number N times */
		return num<<n;
		
	}
	public static int divideBy2NTimes(int num, int n) {
		/*  We can  right shift  the number n times,
		    to get  division of the number N times */
		return num>>n;
		
	}
	
	public static void swap(int a, int b) {
		System.out.println("The first number is  "+ a //  0101
				         + "The second number is  "+ b);//0111
		a = a^b;
		b = a^b; 
		a = a^b;
		
		System.out.println("The first number is  "+ a 
		         + "The second number is  "+ b);	
		
	}
	public static String isIthBitSet(int num, int i) {
		int binNum = Integer.parseInt(Integer.toBinaryString(num));
		System.out.println("The number is  "+ binNum);//0101
		
		if((num & (1<<i)) != 0) {
			return "Set";
		} else {
			return "Not Set";	
		}		
	}
	
	public static int setIthBit(int num, int i) {
		int binNum = Integer.parseInt(Integer.toBinaryString(num));
		System.out.println("The number is  "+ binNum);//0101
		
		int mask =  1<<i;
		num = (mask | num);
		return num;
	}
	public static int clearIthBit(int num, int i) {
		int binNum = Integer.parseInt(Integer.toBinaryString(num));
		System.out.println("Original number's  binary Equivalent is  "+ binNum);//10001
		
		int mask =  ~(1<<i);//01000 -> 00111
		num = (mask & num); //00111 & 10001
		return num;// 0111 = 7
	}
	public static int convertAtoB(int a, int b) {
		// Number of bits needed  to convert a to b.
		int binNumA = Integer.parseInt(Integer.toBinaryString(a));//  1100
		int binNumB = Integer.parseInt(Integer.toBinaryString(b));//  1000
		
		System.out.println("Original number A's binary Equivalent is  "+ binNumA +
						   "  Original number B's binary Equivalent is  "+ binNumB);
		
		int bits = 0;
		
		int aXORb = a ^  b;
		while(aXORb!= 0) {
			aXORb = aXORb & (aXORb -1);
			bits++;
		}
		
		System.out.println("Number of bits needed  to convert a to b are :" +bits);
		return bits;
		
	}
	
	
public static void main(String[] args) {
//	System.out.println(checkEvenOdd(5));
//	System.out.println(checkEvenOdd(1));
//	System.out.println(checkEvenOdd(100));
//	
//	System.out.println(multiplyBy2NTimes(5,3));
//	System.out.println(multiplyBy2NTimes(25,2));
//	
//	System.out.println(divideBy2NTimes(20,2));
//	System.out.println(divideBy2NTimes(99,2));
//	
//	swap(5,7);
	
//	System.out.println(isIthBitSet(5,3));//0101 
//	System.out.println(isIthBitSet(7,2));//111
////	
//	System.out.println(setIthBit(17,2)); // 10001
	
	//System.out.println(clearIthBit(15,3));// 10001
	convertAtoB(12,1);
	
}
}
