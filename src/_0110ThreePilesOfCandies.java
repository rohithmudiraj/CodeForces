import java.util.Scanner;

public class _0110ThreePilesOfCandies {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
		long pile1=sc.nextLong();
		long pile2 = sc.nextLong();
		long pile3 = sc.nextLong();
		boolean flag;long Alice,Bob;
		if(Math.abs(pile1-pile2)<Math.abs(pile2-pile3)) {
		 Alice =Math.max(pile1, pile2);
		 Bob=Math.min(pile1, pile2);
		flag=true;
		}
		else {
			 Alice =Math.max(pile2, pile3);
			 Bob=Math.min(pile2, pile3);
			flag=false;
		}
	//	System.out.println(Alice+" "+Bob);
		if(flag) {
			long diff=Math.abs(Alice-Bob);
			pile3-=diff;
			 Bob+=diff;
			Alice+=pile3/2;
			Bob+=pile3-pile3/2;
		//	System.out.println(Alice+" "+Bob);
			System.out.println(Math.min(Alice, Bob));
		}
		else {
			long diff=Math.abs(Alice-Bob);
			pile1-=diff;
			 Bob+=diff;
			Alice+=pile1/2;
			Bob+=pile1-pile1/2;
			System.out.println(Math.min(Alice, Bob));
		}
			cases--;
		}
	}

}
