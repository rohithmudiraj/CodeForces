import java.util.Scanner;

public class _19Word {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input =sc.nextLine();
		int lower=0;
		for(char i:input.toCharArray()) {
			if(i>=97) {
				lower++;
			}
		}
		
	System.out.println(lower>=input.length()-lower?input.toLowerCase():input.toUpperCase());
	}

}
