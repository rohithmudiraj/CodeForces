import java.util.Scanner;

public class _0119ImBoredWithLife {
	
	static int fact(int n) {
		if(n<=1) {
			return 1;
		}
		int fac=1;
		while(n>0) {
			fac*=n;
			n--;
		}
		return fac;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int min=Math.min(n, m);
		
		System.out.println(fact(min));
	}

}
