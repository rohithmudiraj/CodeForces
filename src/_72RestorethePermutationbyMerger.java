import java.util.Scanner;

public class _72RestorethePermutationbyMerger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		while(cases>0) {
			int n=sc.nextInt();
			int[] arr= new int[n+1];
			
			for(int i=0;i<2*n;i++) {
				int temp=sc.nextInt();
				if(arr[temp]==0) {
					arr[temp]++;
					System.out.print(temp+" ");
				}
			}
			System.out.println();
			
			cases--;
		}
	}

}
