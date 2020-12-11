import java.util.Scanner;

public class _0226NauuoandVotes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int up = sc.nextInt();
		int down =sc.nextInt();
		int uncertain = sc.nextInt();
		
		if(up>down+uncertain) {
			System.out.println("+");
		}
		else if(down>up+uncertain) {
			System.out.println("-");
		}
		else if(up==down&&uncertain==0) {
			System.out.println("0");
		}
		else {
			System.out.println("?");
		}
	}

}
