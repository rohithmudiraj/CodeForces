import java.util.Scanner;

public class _0125TwoRegularPolygons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
		if(sc.nextInt()%sc.nextInt()==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		
		cases--;
		}

	}

}
