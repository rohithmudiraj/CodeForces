import java.util.Scanner;

public class _85FafaandhisCompany {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			int ways=0;
			for(int i=1;i<n;i++) {
				if(n%i==0) {
					ways++;
				}
			}
			System.out.println(ways);

	}

}
