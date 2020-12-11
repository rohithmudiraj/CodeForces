import java.util.Scanner;

public class _0151TwoRivalStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
		int n=sc.nextInt();
		int Swaps=sc.nextInt();
		int posA=sc.nextInt();
		int posB=sc.nextInt();
		int possibleMoves=Math.min(Swaps,(n- Math.max(posA,posB))+(Math.min(posA, posB)-1));
		System.out.println(possibleMoves+(Math.abs(posA-posB)));
		cases--;
		}
	}

}
