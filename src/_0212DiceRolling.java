import java.util.Scanner;

public class _0212DiceRolling {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases =sc.nextInt();
		while(cases>0) {
			int n=sc.nextInt();
			if(n%7==0) {
				System.out.println(n/7);
			}
			else {
				System.out.println(n/7+1);
			}
			
			
			
			
			cases--;
		}
	}

}
