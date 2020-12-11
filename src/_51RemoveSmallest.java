import java.util.Arrays;
import java.util.Scanner;

public class _51RemoveSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases= sc.nextInt();
		for(int k=0;k<cases;k++) {
			boolean flag=true;
			int size=sc.nextInt();
			int[] arr = new int[size];
			for(int j=0;j<size;j++) {
				arr[j]=sc.nextInt();
			}
			Arrays.sort(arr);
			 
			for(int i=0;i<size-1;i++) {
				if(Math.abs(arr[i]-arr[i+1])>1) {
				flag=!flag;
				break;
				}
			}
			if(flag) {
			System.out.println("YES");
			}
			else {
			System.out.println("NO");
			}
			
		}
		
	}

}
