import java.util.Scanner;

public class _0228KidsSeating {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		while(cases>0) {
			int n=sc.nextInt();
			int sum=4*n;
			 sum-=2;
			for(int i=0;i<n;i++) {
				System.out.print(sum+" ");
				sum-=2;
			}
			System.out.println();
			cases--;
		}
	}
}
