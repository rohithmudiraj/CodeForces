import java.util.Scanner;

public class _20NearlyLuckyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long input =sc.nextLong();
		int luckyNum=0;
		while(input>0) {
			if(input%10==4||input%10==7) {
				luckyNum++;
			}
			input/=10;
		}
		System.out.println(luckyNum==4||luckyNum==7?"YES":"NO");
		
	}

}
