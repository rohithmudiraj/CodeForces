import java.util.Arrays;
import java.util.Scanner;

public class _0197Copypaste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			int count=0;
			int min=Integer.MAX_VALUE;
			int n=sc.nextInt();
			int k=sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				int temp =sc.nextInt();
				arr[i]=temp;
				min=Math.min(min, temp);
				
			}
			Arrays.sort(arr);
			
			for(int i=1;i<n;i++) {
				count+=(k-arr[i])/min;
			}
			System.out.println(count);
			cases--;
			
		}
	}

}
