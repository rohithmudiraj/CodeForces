import java.util.Scanner;

public class _0127TwoRabbits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int a= sc.nextInt();
			int b=sc.nextInt();
			int n=y-x;
			int m=a+b;
			if(n%m==0) {
				System.out.println(n/m);
			}else {
			System.out.println(-1);
			}
			cases--;
		}
	}

}
