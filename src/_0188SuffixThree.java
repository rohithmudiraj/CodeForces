import java.util.Scanner;

public class _0188SuffixThree {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int cases =sc.nextInt();
		sc.nextLine();
		while(cases>0) {
			String input =sc.nextLine();
			if(input.endsWith("po")) {
				System.out.println("FILIPINO");
			}
			else if(input.endsWith("mnida")) {
				System.out.println("KOREAN");
			}
			else if(input.endsWith("desu")||input.endsWith("masu")) {
				System.out.println("JAPANESE");
			}	
			cases--;
		}
	}

}
