import java.util.Scanner;

public class _0221BoxisPull {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		while(cases>0) {
			long x1=sc.nextInt();
			long y1=sc.nextInt();
			long x2=sc.nextInt();
			long y2=sc.nextInt();
			
			if(x1==x2&&y1==y2) {
				System.out.println(0);
			}
			else if(x1==x2) {
				System.out.println(Math.abs(y2-y1));
			}
			else if(y1==y2) {
				System.out.println(Math.abs(x2-x1));
			}
			else {
				System.out.println(Math.abs(x2-x1)+2+Math.abs(y2-y1));
			}
			
			
			cases--;
		}

	}

}
