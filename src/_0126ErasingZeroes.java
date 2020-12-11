import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _0126ErasingZeroes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		sc.nextLine();
		while(cases>0) {
		String s=sc.nextLine();
		int prev=-1;
		int diff=0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='1'&&prev==-1) {
				prev=i;
			}
			else if(s.charAt(i)=='0') {
				continue;
			}
			else if(s.charAt(i)=='1') {
				diff+=i-prev-1;
				prev=i;
			}
		}
		System.out.println(diff);
			cases--;
		}
	}

}
