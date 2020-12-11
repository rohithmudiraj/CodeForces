import java.util.Arrays;
import java.util.Scanner;

public class _0161NewYearandNaming {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		String[] arr1 = new String[n];
		String[] arr2 = new String[m];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			arr1[i]=sc.next();
		}
		sc.nextLine();
		for(int i=0;i<m;i++) {
			arr2[i]=sc.next();
		}
		int q=sc.nextInt();
		while(q>0) {
			int l=sc.nextInt();
			int index1=l%n-1;
			int index2=l%m-1;
			if(index1<0) {
				index1=n-1;
			}
			if(index2<0) {
				index2=m-1;
			}
			System.out.println(arr1[index1]+""+arr2[index2]);
			q--;
		}
	}

}
