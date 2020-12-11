import java.util.Scanner;

public class _0166Divideit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		while(cases>0) {
			long n=sc.nextLong();
			int moves=0;
			while(n>1) {
				if(n%5==0) {
					n=4*n/5;
				}
				else if(n%3==0) {
					n=2*n/3;
				}
				else if(n%2==0) {
					n=n/2;
					}
				else {
					moves=-1;
					break;
				}
				moves++;
			}
				System.out.println(moves);
			cases--;
		}
	}

}
