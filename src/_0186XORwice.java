import java.util.Scanner;

public class _0186XORwice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases =sc.nextInt();
		while(cases>0) {
		long a=sc.nextInt();
		long b=sc.nextInt();
		
		long max=Math.max(a, b);
		
		for(int i=0;i<=max;i++) {
			if(i%a==0 && i%b==0) {
				System.out.println(a^i+b^i);
				break;
			}
		}
		
		cases--;	
	}
	}

}
