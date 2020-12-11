import java.util.Scanner;

public class _0148CrazyComputer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		int prev=sc.nextInt();
		int words=1;
		for(int i=0;i<n-1;i++) {
			int curr=sc.nextInt();
			
			if(curr-prev>c) {
				words=1;
			}
			else {
				words++;
			}
			
			prev=curr;
		}
		System.out.println(words);
	}

}
