import java.util.Scanner;

public class _22AntonAndDanik {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		sc.nextLine();
		String input = sc.nextLine();
		int AntonWins=0;
		
		for(char c:input.toCharArray()) {
			if(c=='A'){
				AntonWins++;
			}
		}
		if(AntonWins<num-AntonWins) {
			System.out.print("Danik");
		}
		else if(AntonWins>num-AntonWins) {
			System.out.print("Anton");
		}
		else {
			System.out.print("Friendship");
		}
	}

}
