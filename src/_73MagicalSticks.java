import java.util.Scanner;

public class _73MagicalSticks {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		while(cases>0) {
			int n= sc.nextInt();
			
			if(n%2==0)
			{
				System.out.println(n/2);
			}
			else {
				System.out.println(n/2+1);

			}
			
			cases--;
		}
	}

}
