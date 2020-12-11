import java.util.Arrays;
import java.util.Scanner;

public class _0108BadTriangle {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int cases = sc.nextInt();
			
			while(cases>0) {
				int n=sc.nextInt();
				boolean flag=true;
				int[] arr= new int[n];
				for(int i=0;i<n;i++) {
					arr[i]=sc.nextInt();
				}	
				int j;
				for(j=0;j<n-2;j++) {
					if(arr[j]+arr[j+1]<=arr[n-1]) {
						flag=!flag;
						break;
					}
				}
				
				if(flag) {
					System.out.println(-1);
				}
				else {
					System.out.println((j+1)+" "+(j+2)+" "+n);
				}
				cases--;
			}
	}

}
