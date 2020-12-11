import java.util.Arrays;
import java.util.Scanner;

public class _65EvenArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			int n=sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			int even=0;
			int odd=0;
			int fine=0;
			for(int i=0;i<n;i++) {
				if(i%2==0) {
					if(a[i]%2==0) {
						fine++;
					}
					else {
						even++;
					}
				}
				else{
					
					if(a[i]%2==1) {
						fine++;
					}
					else {
						odd++;
					}
				}
			}
			if(fine==n) {
			System.out.println(0);
			}
			else if(odd==even) {
				System.out.println(odd);
			}
			else {
				System.out.println(-1);
			}
			cases--;
		}
	}
}
