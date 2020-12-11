import java.util.Scanner;

public class _0156OmkarandPassword {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		while(cases>0) {
			int n=sc.nextInt();
			boolean flag=true;
			int prev=sc.nextInt();
			for(int i=0;i<n-1;i++) {
				if(sc.nextInt()!=prev) {
					flag=false;
				}
			}
			if(flag) {
				System.out.println(n);
			}
			else{
				System.out.println(1);
			}
			cases--;
		}
	}

}
