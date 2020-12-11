import java.util.Scanner;

public class _0177PensandPencils {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int k =sc.nextInt();
			int x,y;
			
		if(a%c==0) {
			x=a/c;
		}
		else {
			x=a/c+1;

		}
	
		if(b%d==0) {
		y=b/d;
		}
		else {
			y=b/d+1;
		}
			
			if(x+y<=k) {
				System.out.println(x+" "+y);
			}
			else {
				System.out.println(-1);
			}
			cases--;
		}
	}

}
