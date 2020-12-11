import java.util.Arrays;
import java.util.Scanner;

public class _0154Cakeminator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] rows = new int[n];
		int[] columns = new int[m];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String s=sc.nextLine();
			if(s.contains("S")) {
				rows[i]=1;
				for(int j=0;j<m;j++) {
					if(s.charAt(j)=='S') {
						columns[j]=1;
					}
				}
				
			}
		}
	int	resRows=0;
	int	resCol=0;
//		System.out.println(Arrays.toString(rows));
//		System.out.println(Arrays.toString(columns));
		for(int i=0;i<n;i++) {
			if(rows[i]==0) {
				resRows++;
			}
		}
		for(int i=0;i<m;i++) {
			if(columns[i]==0) {
				resCol++;
			}
		}
		System.out.println((resRows*m)+(resCol*n)-(resCol*resRows));
		
	}

}
