import java.util.Arrays;
import java.util.Scanner;

public class _0213ArrayRearrangment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		while(cases>0) {
			int n=sc.nextInt();
			int x=sc.nextInt();
			boolean flag=true;
			
			int[] a = new int[n];
			int[] b = new int[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				b[i]=sc.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			
			for(int i=0;i<n;i++) {
				if(a[i]+b[n-1-i]>x) {
					flag=!flag;
					break;
				}
			}
			
			if(flag) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			cases--;
		}
	}

}
