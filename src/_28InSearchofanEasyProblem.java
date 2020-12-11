import java.util.Scanner;

public class _28InSearchofanEasyProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opinions =sc.nextInt();
		while(opinions>0) {
			if(sc.nextInt()==1) {
				System.out.print("HARD");
				return;
			}
			opinions--;
		}
		System.out.println("EASY");
		
	}

}
