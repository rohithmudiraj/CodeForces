import java.util.Scanner;

public class _41Pangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input<26) {
			System.out.println("NO");
			return;
		}
		sc.nextLine();
		String word = sc.nextLine();
		String alphabet="abcdefghijklmnopqrstuvwxyz";
		word=word.toLowerCase();
		
		for(int i=0;i<alphabet.length();i++) {
			if(word.indexOf(alphabet.charAt(i))==-1) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

}
