import java.util.Scanner;

public class _31UltraFastMathematician {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input =sc.nextLine();
		String input2 = sc.nextLine();
		
		for(int i=0;i<input.length();i++) {
			if(Character.compare(input.charAt(i),input2.charAt(i))==0) {
				System.out.print(0);
			}
			else {
				System.out.print(1);
			}
		}
		
		
	}

}
