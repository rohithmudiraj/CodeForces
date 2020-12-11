import java.util.Scanner;

public class _0134RepeatingCipher {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		int length=sc.nextInt();

		sc.nextLine();
		String result=sc.nextLine();
		int count=1;
		for(int i=0;i<length;i+=count) {
			System.out.print(result.charAt(i));
			count++;
		}
	}

}
