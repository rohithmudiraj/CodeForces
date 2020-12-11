import java.util.Scanner;

public class _0163GotAnyGrapes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int  Andrew=sc.nextInt();
		int Dmitry =sc.nextInt();
		int Michal = sc.nextInt();
		int green =sc.nextInt();
		int purple =sc.nextInt();
		int black =sc.nextInt();
		if(green+black+purple<Andrew+Dmitry+Michal||(green<Andrew)||(green-Andrew+purple)<Dmitry||(green-Andrew+purple-Dmitry+black<Michal)) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
	}

}
