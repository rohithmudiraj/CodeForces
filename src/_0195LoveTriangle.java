import java.util.Scanner;

public class _0195LoveTriangle {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int temp=arr[i];
			if(arr[arr[temp-1]-1]==i+1) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

}
