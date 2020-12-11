import java.util.Scanner;

public class _0198Compote {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int n=Math.min(a/1, Math.min(b/2, c/4));
		System.out.println(7*n);
	}

}
