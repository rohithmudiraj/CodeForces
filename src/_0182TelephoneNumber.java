import java.util.Scanner;

public class _0182TelephoneNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			int n=sc.nextInt();
			sc.nextLine();
			String phone =sc.nextLine();
				int index =phone.indexOf('8');
				if(n-index>=11&&index!=-1) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			cases--;
		}
	}

}
