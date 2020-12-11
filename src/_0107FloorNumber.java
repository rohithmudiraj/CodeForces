import java.util.Scanner;

public class _0107FloorNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			int n=sc.nextInt();
			int floor=1;
			int size=sc.nextInt();
			if(n<=2) {
				System.out.println(floor);
			}
			else {
			for(int i=2;i<n;i+=size) {
				floor++;
			}
			System.out.println(floor);
			}
			cases--;
		}
	}

}
