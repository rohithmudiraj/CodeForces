import java.util.Scanner;

public class _0179MishkaandContest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int start=0;
		int end=n-1;
		while(start<end) {
			if(arr[start]>k&&arr[end]>k) {
				break;
			}
			if(arr[start]<=k) {
				start++;
			}
			if(arr[end]<=k) {
				end--;
			}
		}
		if(start==n/2&&end==n/2) {
			if(arr[n/2]>k)
			System.out.println(n-1);
			else
				System.out.println(n);
		}
		else {
		System.out.println(n-(end-start+1));
		}
		
	}

}
