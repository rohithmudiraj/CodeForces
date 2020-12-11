import java.util.Scanner;

public class _0111MezoplayingZoma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		int left=0;
		int right=0;
		for(char c:s.toCharArray()){
			if(c=='L') {
				left++;
			}
			else if(c=='R') {
				right++;
			}
		}
		System.out.println(left+right+1);
	}

}
