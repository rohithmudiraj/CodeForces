import java.util.Scanner;

public class _79CollectingCoins {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases =sc.nextInt();
		
		while(cases>0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c= sc.nextInt();
			int n=sc.nextInt();
			int max=Math.max(a,(Math.max(b, c)));
			
			int diff=max-a+max-b+max-c;
			if((n-diff)%3==0&&n>=diff) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");

			}
			
			cases--;
		}
	}

}
