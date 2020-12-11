import java.util.Scanner;


public class _68TeamOlympiad {
public static int min(int[] arr) {
	int min=Integer.MAX_VALUE;
	for(int i=1;i<arr.length;i++) {
		min=Math.min(min, arr[i]);
	}
	return min;
}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] mat = new int[4][n];
		int[] indexes = new int[4];
		
		for(int i=1;i<=n;i++) {
			int temp=sc.nextInt();
			mat[temp][indexes[temp]++]=i;
		}
		
		int mi =min(indexes);
		if(mi ==0) {
			System.out.println(0);
		}
		else {
		System.out.println(mi);
		for(int i=0;i<mi;i++) {
			System.out.print(mat[1][i]+" ");
			System.out.print(mat[2][i]+" ");
			System.out.print(mat[3][i]);
			System.out.println();

		}
		}
	}

}
