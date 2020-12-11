import java.util.Scanner;

public class _0184WaterBuying {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			long n=sc.nextLong();
			long a=sc.nextLong();
			long b=sc.nextLong();
			long count=0;
			if(a*2<b) {
				count+=(n/1)*a;
				n%=1;
				if(n!=0) {
				count+=(n/2)*b;}
			}
			else {
				
				count+=(n/2)*b;
				n%=2;
				if(n!=0) {
				count+=(n%2)*a;}
			}	
			System.out.println(count);
			cases--;
		}
	}

}
