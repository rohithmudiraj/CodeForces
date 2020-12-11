import java.util.Scanner;

public class _0146Twodistinctpoints {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			int l1=sc.nextInt();
			int r1=sc.nextInt();
			int l2=sc.nextInt();
			int r2=sc.nextInt();
			if(r1!=l2) {
			System.out.print(r1+" "+l2);
			}
			else {
				System.out.println(r1-1+" "+l2);
			}
			cases--;
			System.out.println();
		}
	}

}
