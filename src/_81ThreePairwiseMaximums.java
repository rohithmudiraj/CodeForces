import java.util.Arrays;
import java.util.Scanner;

public class _81ThreePairwiseMaximums {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cases =sc.nextInt();
		
		while(cases>0) {
		int[] a = new int[3];
			for(int i=0;i<3;i++) {
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			if(a[2]==a[1]) {
				System.out.println("YES");
				System.out.println(a[2]+" "+a[0]+" "+a[0]);
			}
			else {
				System.out.println("NO");

			}
			
			
			
			cases--;
		}
	}

}
