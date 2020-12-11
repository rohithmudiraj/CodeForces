import java.util.Scanner;

public class _0136NearestInterestingNumber {
	
	static int calculateSum(int n) {
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		while(calculateSum(n)%4!=0) {
			n++;
		}
		System.out.println(n);
				}

}
