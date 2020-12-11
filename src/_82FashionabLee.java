import java.util.Arrays;
import java.util.Scanner;

public class _82FashionabLee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases =sc.nextInt();
		
		while(cases>0) {
		int n=sc.nextInt();
				
		if(n%4==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
			cases--;
		}
	}

}
