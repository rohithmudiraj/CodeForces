import java.util.Scanner;

public class _0199CardGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases =sc.nextInt();
		while(cases>0) {
			int n=sc.nextInt();
			int k1=sc.nextInt();
			int k2=sc.nextInt();
		int	maxA=Integer.MIN_VALUE;
		int	maxB=Integer.MIN_VALUE;
			for(int i=0;i<k1;i++) {
				maxA=Math.max(maxA, sc.nextInt());
			}
			for(int i=0;i<k2;i++) {
				maxB=Math.max(maxB,sc.nextInt());
			}
			if(maxA>maxB) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
			
			
			
			
			cases--;
		}
		
	}

}
