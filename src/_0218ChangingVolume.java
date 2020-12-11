import java.util.Scanner;

public class _0218ChangingVolume {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		while(cases>0) {
			int a = sc.nextInt();
			int b=sc.nextInt();
			int x=Math.abs(a-b);
			int ans=0;
			 if(x>=5) ans+=x/5;x%=5;
		        if(x>=2) ans+=x/2;x%=2;
		        if(x>=1) ans+=x;
			
			System.out.println(ans);
			cases--;
		}
	}

}
