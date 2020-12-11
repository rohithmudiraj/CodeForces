import java.util.Scanner;

public class _0120FileName {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String filee=sc.nextLine();
		int currLen=0;
		int changes=0;
		for(int i=0;i<n;i++) {
			if(filee.charAt(i)=='x') {
				currLen++;
			}
			else {
				currLen=0;
			}
			if(currLen>=3) {
			changes++;
			}
			
		}
		System.out.println(changes);
	}

}
