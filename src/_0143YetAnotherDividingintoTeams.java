import java.util.Arrays;
import java.util.Scanner;

public class _0143YetAnotherDividingintoTeams {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		while(cases>0) {
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		boolean flag=true;
		Arrays.sort(arr);
	for(int i=0;i<n-1;i++) {
		if(arr[i+1]-arr[i]==1) {
			flag=!flag;
			break;
		}
		}
	if(flag) {
		System.out.println(1);
	}
	else {
		System.out.println(2);
	}
	cases--;
		}
	}

}
