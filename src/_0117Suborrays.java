import java.util.Scanner;

public class _0117Suborrays {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cases =sc.nextInt();
		
		while(cases>0) {
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				System.out.print((i+1)+" ");
			}
			
			System.out.println();
			cases--;
		}
		
	}

}
