import java.util.Scanner;

public class _77AddOddorSubtractEven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cases =sc.nextInt();
		
		while(cases>0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a>b) {
				if((a-b)%2==0) {
					System.out.println(1);
				}
				else {
					System.out.println(2);

				}
			}
			else if(a<b) {
				if((b-a)%2==0) {
					System.out.println(2);
				}
				else {
					System.out.println(1);

				}
			}
			else {
				System.out.println(0);
			}
			
			cases--;
		}
	}

}
