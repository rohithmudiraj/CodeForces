import java.util.Scanner;

public class _67PhoneixAndBalance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			int n=sc.nextInt();
			
			int a=(int) Math.pow(2, n);
			int b=0;
			int mid =n/2;
			for(int i=1;i<n;i++) {
				if(i<mid) {
					a+=Math.pow(2, i);
				}
				else {
					b+=Math.pow(2, i);
				}
			}
			System.out.println(Math.abs(a-b));
			
			
			cases--;
		}
	}

}
