import java.util.Arrays;
import java.util.Scanner;

public class _0142TeamsForming {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int sum=0;
		for(int i=0;i<n-1;i+=2) {
			sum+=arr[i+1]-arr[i];
		}
		System.out.println(sum);
	}

}
