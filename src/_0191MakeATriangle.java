import java.util.Arrays;
import java.util.Scanner;

public class _0191MakeATriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i=0;i<3;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		if(arr[0]+arr[1]>arr[2]) {
			System.out.println(0);
		}
		else {
		System.out.println(arr[2]+1-arr[0]-arr[1]);
		}
	}

}
