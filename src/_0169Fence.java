import java.util.Scanner;

public class _0169Fence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		while(cases>0) {
		long n=sc.nextInt();
		long k=sc.nextInt();
		long c=sc.nextInt();
		System.out.println(n+k+c-1);
		cases--;
		}
	}

}
