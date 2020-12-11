import java.util.Scanner;

public class _0174SashaandSticks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long k=sc.nextLong();
		long result =n/k;
		if(result%2!=0) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
		
	}

}
