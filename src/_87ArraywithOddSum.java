import java.util.Scanner;

public class _87ArraywithOddSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases =sc.nextInt();
		
		while(cases>0) {
		int n=sc.nextInt();
		int sum=0;
		int odd=0;
		for(int i=0;i<n;i++) {
			int temp=sc.nextInt();
			if(temp%2!=0) {
				odd++;
			}
			sum+=temp;
		}
		if(sum%2==0&& (odd==0||odd==n)) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");

		}
				
			cases--;
		}
	}

}
