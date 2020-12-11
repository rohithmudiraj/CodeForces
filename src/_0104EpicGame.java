import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _0104EpicGame {
	
	static int gcd(int a,int b) {
		int max=Math.max(a, b);
		int store=0;
		for(int i=1;i<=max;i++) {
			if(a%i==0&&b%i==0){
store=i;			}
		}
		return store;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		boolean flag=true;
		while(n>0) {
		if(flag) {
			n-=gcd(a,n);
			flag=!flag;
		}
		else {
			n-=gcd(b,n);
			flag=!flag;
		}	
		}
		if(!flag) {
			System.out.println(0);

		}
		else {
			System.out.println(1);

		}
	}

}
