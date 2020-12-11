import java.util.Arrays;
import java.util.Scanner;

public class _0196DiverseStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases =sc.nextInt();
		sc.nextLine();
		String set ="abcdefghijklmnopqrstuvwxyz";
		while(cases>0) {
			String input=sc.nextLine();
			char[] arr = input.toCharArray();
			Arrays.sort(arr);
			String dit = new String(arr);
			if(set.contains(dit)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			cases--;
		}
	}

}
