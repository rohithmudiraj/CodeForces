import java.util.Scanner;

public class _42CandiesandTwoSisters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i=0;i<input;i++) {
		int candies=sc.nextInt();
		if(candies<3) {
			System.out.println(0);
			
		}
		else if(candies%2==0) {
			System.out.println((candies/2)-1);
		}
		else {
		System.out.println(candies/2);
		}

		}
	}

}
