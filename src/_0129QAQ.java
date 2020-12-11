import java.util.Scanner;

public class _0129QAQ {
	
	static void check(String s) {
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	String s=sc.nextLine();
		int cnt=0,x=0,y=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='Q'){
			cnt+=x;
			y++;
		}
		else if(s.charAt(i)=='A') {
			x+=y;
		}
	}
	System.out.println(cnt);
	
	}

}
