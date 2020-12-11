import java.util.Scanner;

public class _63MinimalSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int min=Math.min(a, b);
			int max = Math.max(a, b);
			if(min*2>=max) {
				System.out.println((int)Math.pow(min*2, 2));
			}
			else {
				System.out.println((int)Math.pow(max, 2));

			}
			cases--;
		}
		
	}

}
