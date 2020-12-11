import java.util.Scanner;

public class _0175IntegerSequenceDividing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n=sc.nextInt();
		long m=n*(n+1);
		m/=2;
		System.out.println(m%2);
	}

}
