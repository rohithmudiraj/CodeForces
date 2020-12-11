import java.util.Scanner;

public class _0101NightAtTheMuseum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int moves=0;
		int a=1;

		for(int i=0;i<input.length();i++) {
			int b=(int)input.charAt(i)-96;
			
		//	System.out.println(a+" "+b);

			if(a>b) {
			moves+=(Math.min(26-a+b, Math.abs(a-b)));
			}else {
				moves+=(Math.min(26-b+a, Math.abs(a-b)));
			}
		//	System.out.println(moves);

			a=b;
		}
		System.out.println(moves);
	}

}
