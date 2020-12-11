import java.util.Scanner;

public class _21Translation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input =sc.nextLine();
		String trans = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		sb.reverse();
		System.out.print(sb.toString().equals(trans)?"YES":"NO");
}

}
