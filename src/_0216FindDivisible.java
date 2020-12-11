import java.util.Scanner;

public class _0216FindDivisible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			int n=sc.nextInt();
			sc.nextInt();
			System.out.println(n+" "+2*n);
			cases--;
		}
	}

}
