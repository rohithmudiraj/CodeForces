import java.util.Scanner;

public class _56ShortSubstrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		sc.nextLine();
		while(cases>0) {
		String b=sc.nextLine();
		String a="";
		for(int i=0;i<b.length();i+=2) {
			a+=b.charAt(i);
		}
		a+=b.charAt(b.length()-1);
		System.out.println(a);
		cases--;
	}
	}

}
