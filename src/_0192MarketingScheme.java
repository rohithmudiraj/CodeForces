import java.util.Scanner;

public class _0192MarketingScheme {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int cases=sc.nextInt();
		while(cases>0) {
			if(2*sc.nextInt()>sc.nextInt()) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
			cases--;
		}
	}

}
