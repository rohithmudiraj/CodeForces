import java.util.Scanner;

public class _66MishkaandGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int Mishka=0;
		int Chris =0;
		while(n>0) {
			int score1=sc.nextInt();
			int score2 = sc.nextInt();
			if(score1>score2) {
				Mishka++;
			}
			else if(score1<score2){
				Chris++;
			}
			n--;
		}
		
		if(Mishka>Chris) {
			System.out.println("Mishka");
		}
		else if(Mishka<Chris) {
			System.out.println("Chris");
		}
		else {
			System.out.println("Friendship is magic!^^");
		}

	}

}
