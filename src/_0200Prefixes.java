import java.util.Scanner;

public class _0200Prefixes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		int count=0;
		String input = sc.nextLine();
		StringBuilder inpu=new StringBuilder(input);
		
		for(int i=0;i<n;i+=2) {
			if(!((input.charAt(i)=='a'&&input.charAt(i+1)=='b') || (input.charAt(i)=='b'&&input.charAt(i+1)=='a'))) {
				
				if(input.charAt(i)=='a') {
					inpu.setCharAt(i, 'b');
				}
				else {
					inpu.setCharAt(i, 'a');
				}
				count++;
			}
		}
		System.out.println(count);
		System.out.println(inpu);
	}

}
