import java.util.Scanner;

public class _0190LoveA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input =sc.nextLine();
		boolean flag = false;int changes=0;
		int max=0;
		int n=input.length();		
		for(int i=0;i<input.length();i++) {
			char temp =input.charAt(i);
			if(temp=='a') {	
				max++;
			}
		}
		if(max>n/2) {
		System.out.println(n);
		}
		else {
			System.out.println(max*2-1);
		}
	}

}
