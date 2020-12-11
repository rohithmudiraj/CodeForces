import java.util.Arrays;
import java.util.Scanner;

public class _61TwoArraysAndSwaps {
	static int summ(int[] arr) {
		int add=0;
		for(int i=0;i<arr.length;i++) {
			add+=arr[i];
		}
		return add;
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			b[j]=sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int l=0;l<k;l++) {
			if(a[l]<b[n-1-l]) {
			int	temp=a[l];
			a[l]=b[n-1-l];
			b[n-1-l]=temp;
			}
		}
		System.out.println(summ(a));
		cases--;
		}
	}

}
