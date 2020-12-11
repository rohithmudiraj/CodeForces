import java.util.Scanner;

public class _0165ThreeStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		sc.nextLine();
		while(cases>0) {
			String a = sc.nextLine();
			String b=sc.nextLine();
			String c = sc.nextLine();
			boolean flag=true;
			
			for(int i=0;i<a.length();i++) {
				if(c.charAt(i)!=a.charAt(i)&&c.charAt(i)!=b.charAt(i)) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			cases--;
		}
	}

}
