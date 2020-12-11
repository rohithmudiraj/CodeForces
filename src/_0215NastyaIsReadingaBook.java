import java.util.Scanner;

public class _0215NastyaIsReadingaBook {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sc.nextInt();
		}
		int x=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(arr[i-1]>x) {
				System.out.println(n-i+2);
				return;
			}
		}
		System.out.println(1);
	}

}
