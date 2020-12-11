import java.util.Arrays;
import java.util.Scanner;

public class _0155Reorder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		while(cases>0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int sum=0;
			for(int i=0;i<n;i++) {
				sum+=sc.nextInt();
			}
			System.out.println(sum==m?"YES":"NO");
			cases--;
		}
	}

}
