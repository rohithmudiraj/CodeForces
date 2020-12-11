import java.util.Scanner;

public class _0189BetweentheOffices {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String input =sc.nextLine();
		int good=0;int bad=0;
		char prev=input.charAt(0);
		for(int i=1;i<n;i++) {
			char temp=input.charAt(i);
			if(prev=='S'&&temp=='F') {
				good++;
			}
			else if(prev=='F'&&temp=='S') {
				bad++;
			}
			prev=temp;
		}
		if(good>bad) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");

		}
	}

}
