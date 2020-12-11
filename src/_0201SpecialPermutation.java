import java.util.Arrays;
import java.util.Scanner;

public class _0201SpecialPermutation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		while(cases>0) {
			int n=sc.nextInt();
			int[] arr = new int[n];
			for(int i=1;i<n;i+=2) {
				arr[i]=i;
				arr[i-1]=i+1;
			}
			if(n%2!=0) {
				int temp=arr[n/2];
				arr[n/2]=n;
				arr[n-1]=temp;
			}
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
	
			}
			System.out.println();
			cases--;
		}
	}

}
