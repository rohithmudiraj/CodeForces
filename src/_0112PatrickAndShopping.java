import java.util.Scanner;

public class _0112PatrickAndShopping {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int d1=sc.nextInt();
		int d2=sc.nextInt();
		int d3=sc.nextInt();
		int shortPath =2*d1+2*d2;
		int alternate =Math.min(d1+d2+d3, Math.min(2*(d3+d1), 2*(d3+d2)));
		
		if(shortPath<=alternate) {
			System.out.println(shortPath);
		}
		else {
			System.out.println(alternate);
		}
	
	}

}
