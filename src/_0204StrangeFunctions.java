import java.util.Scanner;

public class _0204StrangeFunctions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		while(cases>0) {
			
			long n=sc.nextInt();
			String temp=String.valueOf(n);
			StringBuilder input = new StringBuilder(temp);
			long store=Long.valueOf(input.reverse().toString());
			System.out.println(store);
			cases--;
		}
	}

}
