import java.util.Scanner;

public class _0149DistinctDigits {
	static boolean distinct(int b) {
		String n=b+"";
	String temp="";
	for(int i=0;i<n.length();i++) {
		if(temp.indexOf(n.charAt(i))==-1) {
			temp+=n.charAt(i);
		}
		else {
			return false;
		}
	}
	return true;
	
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		
		for(int i=l;i<=r;i++) {
			if(distinct(i)) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}

}
