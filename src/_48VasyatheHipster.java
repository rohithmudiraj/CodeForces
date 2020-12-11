import java.util.Scanner;

public class _48VasyatheHipster {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int red= sc.nextInt();
		int blue= sc.nextInt();
		int max=Math.max(red, blue);
		int min=Math.min(red, blue);

		System.out.print(min+" "+(max-min)/2);
	}

}
