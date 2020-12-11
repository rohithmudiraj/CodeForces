import java.util.Scanner;

public class _0139CME {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
		int n=sc.nextInt();
		if(n==2) {
			System.out.println(2);
		}
		else if(n%2==0) {
			System.out.println(0);

		}
		else if(n%2!=0) {
			System.out.println(1);

		}
		cases--;
		}
		
	}

}
