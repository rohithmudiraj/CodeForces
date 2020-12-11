import java.util.Arrays;
import java.util.Scanner;

public class _43AmusingJoke {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		name+= sc.nextLine();
		String mail = sc.nextLine();
		
		char[] c = mail.toCharArray();
		Arrays.sort(c);
		char[] d = name.toCharArray();
		Arrays.sort(d);
if(Arrays.toString(d).equals(Arrays.toString(c))) {
	System.out.println("YES");
}
else {
	System.out.println("NO");

}

	}
	

}
