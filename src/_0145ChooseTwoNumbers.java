import java.util.Scanner;

public class _0145ChooseTwoNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int maxA=0;
		int maxB=0;
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int temp=sc.nextInt();
			maxA=Math.max(maxA, temp);
		}
		
		int m=sc.nextInt();
		for(int i=0;i<m;i++) {
			int temp=sc.nextInt();
			maxB=Math.max(maxB, temp);
		}
		System.out.println(maxA+" "+maxB);
	}

}
