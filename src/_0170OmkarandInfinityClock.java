import java.util.Arrays;
import java.util.Scanner;

public class _0170OmkarandInfinityClock {
	static long findmax(long[] arr) {
		long max=0;
		for(int i=0;i<arr.length;i++) {
			max=Math.max(max, arr[i]);
		}
		return max;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		while(cases>0) {
		int n=sc.nextInt();
		long moves=sc.nextLong();
		long[] arr = new long[n];
		long max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			long temp=sc.nextLong();
			arr[i]=temp;
			max=Math.max(max, temp);
		}	
		if(moves%2==0) {
			moves=2;
		}
		else {
			moves=1;
		}
		for(int j=0;j<moves;j++) {
		for(int i=0;i<n;i++) {
			arr[i]=max-arr[i];	
		}
		max=findmax(arr);
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		cases--;
		}	
		}

}
