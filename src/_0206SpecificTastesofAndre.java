import java.util.Scanner;

public class _0206SpecificTastesofAndre {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		while(cases>0) {
			int n=sc.nextInt();
			int num=4;
			while(n>0) {
				System.out.print(num+" ");
				n--;
			}
			System.out.println();

			cases--;
		}
	}

}
