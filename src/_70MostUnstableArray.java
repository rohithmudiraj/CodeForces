import java.util.Scanner;

public class _70MostUnstableArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cases=sc.nextInt();
		
		while(cases>0) {
		int n= sc.nextInt();
		int m=sc.nextInt();
		if(n==1) {
			System.out.println(0);
		}
		else if(n==2) {
			System.out.println(m);
			
		}
		else {
			System.out.println(2*m);
		}
		cases--;
		}
	}

}
