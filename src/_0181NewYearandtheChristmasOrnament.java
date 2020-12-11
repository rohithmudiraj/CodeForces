import java.util.Scanner;

public class _0181NewYearandtheChristmasOrnament {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=Math.min(sc.nextInt(), Math.min(sc.nextInt()-1, sc.nextInt()-2));
		System.out.print(3*n+3);
		
	}

}
