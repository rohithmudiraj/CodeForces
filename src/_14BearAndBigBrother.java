import java.util.Scanner;

public class _14BearAndBigBrother {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int LimikWeigth = sc.nextInt();
		int BobWeight = sc.nextInt();
		int years =0;
		while(LimikWeigth<=BobWeight) {
			LimikWeigth*=3;
			BobWeight*=2;
			years++;
		}
		System.out.println(years);			

	
	}

}
