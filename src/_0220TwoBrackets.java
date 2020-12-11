import java.util.Scanner;

public class _0220TwoBrackets {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		while(cases>0) {
			String temp = sc.nextLine();
			int total=0;
			int t1=0;
			int t2=0;
			for(int i=0;i<temp.length();i++) {
				if(temp.charAt(i)=='(') {
					t1++;
				}
				if(temp.charAt(i)=='[') {
					t2++;
				}
				if(temp.charAt(i)==']') {
					if(t2>0) {
						total++;
						t2--;
					}
				}
				if(temp.charAt(i)==')') {
					if(t1>0) {
						total++;
						t1--;
					}
				}
			}
			
			System.out.println(total);
			cases--;
		}
	}

}
