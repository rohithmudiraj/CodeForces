import java.util.Scanner;

public class _10Capatalization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input=	sc.nextLine();
		System.out.println(input.substring(0,1).toUpperCase()+input.substring(1));

	}

}
