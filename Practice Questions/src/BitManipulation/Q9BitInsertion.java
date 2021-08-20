package BitManipulation;

public class Q9BitInsertion {
	public static int insertBits(long N,long M,int i,int j) {
		int res =0;
		int allOnes = ~0;
		// Left of j needs to have same digits after AND 
		int leftMask = allOnes << (j+1); 
		
		System.out.println("Left Mask:"+ Integer.toBinaryString(leftMask));
		int rightMask = (1 << i) - 1;
		System.out.println("Right Mask:"+ Integer.toBinaryString(rightMask));
		System.out.println("M:"+ (int) M);
		long Mnew = M << i;
		System.out.println("M:"+ (int) Mnew);
		int mask = rightMask | leftMask;
		System.out.println("Mask:"+ Integer.toBinaryString(mask));
		System.out.println("Mask| Mnew:"+ Integer.toBinaryString((int) (mask | Mnew)));
		return res;
	}
public static void main(String[] args) {
	long N = 11111111111L;
	long M = 10011;
	int i = 2,j = 6;
	insertBits(N,M,i,j);
}
}
