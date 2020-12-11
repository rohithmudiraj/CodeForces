import java.util.Scanner;

public class _0116EqualizePriceAgain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		while(cases>0) {
		
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=sc.nextInt();
		}
		System.out.println(sum%n==0?sum/n:sum/n+1);
		cases--;
		}
	}

}
