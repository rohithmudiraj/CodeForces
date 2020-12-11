import java.util.Scanner;

public class _64RequiredRemainder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int n=sc.nextInt();
				int a=n%x;
				if(a-y>=0) {
					n=n-(a-y);
				}
				else {
					n=n-a-x+y;
				}
				System.out.println(n);
			cases--;
		}
	}

}
