import java.util.Scanner;

public class _0158AdjacentReplacements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int temp=sc.nextInt();
			if(temp%2==0) {
				System.out.print(temp-1+" ");
			}
			else {
				System.out.print(temp+" ");
			}
		}
	}

}
