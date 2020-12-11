import java.util.Arrays;
import java.util.Scanner;

public class _69HonestCoach {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		
		while(cases>0) {
			int n=sc.nextInt();
			int min=Integer.MAX_VALUE;
			int[] arr= new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				}
			Arrays.sort(arr);
			for(int i=0;i<n-1;i++) {
				min=Math.min(min,arr[i+1]-arr[i]);
			}
			
			System.out.println(min);
			
			cases--;
		}
	}

}
