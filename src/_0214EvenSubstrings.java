import java.util.Scanner;

public class _0214EvenSubstrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String input = sc.nextLine();
		int sum=0;
		for(int i=0;i<n;i++) {
			if(Integer.valueOf(input.charAt(i)+"")%2==0) {
				sum+=i+1;
			}
		}
		System.out.println(sum);
	}

}
