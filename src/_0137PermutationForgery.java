import java.util.Arrays;
import java.util.Scanner;

public class _0137PermutationForgery {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		while(cases>0) {
			int n=sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			for(int i=n-1;i>=0;i--) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();

			cases--;
		}
			}
		}
	


