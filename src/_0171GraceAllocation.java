import java.util.Scanner;

public class _0171GraceAllocation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int init=sc.nextInt();
			int sum=init;
			for(int i=0;i<n-1;i++) {
				sum+=sc.nextInt();
			}
			System.out.println(Math.min(sum, m));	
			cases--;
		}
		
	}

}
