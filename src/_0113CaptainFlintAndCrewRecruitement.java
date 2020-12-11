import java.util.Arrays;
import java.util.Scanner;

public class _0113CaptainFlintAndCrewRecruitement {
	
	static boolean IsPrime(int n) {
		if(n<=1) {
			return false;
		}
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
				
			}
		}
		return true;
	}


	static int[] NearlyPrime(int n) {
	//	System.out.println(n);
	
		for(int i=2;i<n;i++) {
			if(IsPrime(i)&&IsPrime(n/i)&&(i!=n/i)&&(i*(n/i)==n)&&(n%i==0)) {
				return new int[] {i,n/i};
			}
		}
		return null;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		while(cases>0) {
			int count=2;
			int[] sum=new int[3];
			int total=0;
			int n=sc.nextInt();
			
			for(int i=0;i<=n&&count>=0;i++) {
				if(NearlyPrime(i)!=null) {
			//		System.out.print(n+" ");
					sum[count] =i;
					count--;
					total+=i;
				}
			}
			
			if(count<0&&total<n) {
				if(n==36||n==40||n==44) {
					System.out.println("YES");
				System.out.println(6+" "+10+" "+15+" "+(n-31));
				}
				else {
				System.out.println("YES");
				System.out.println(sum[0]+" "+sum[1]+" "+sum[2]+" "+(n-(sum[2]+sum[0]+sum[1])));
			}
			}
			else {
				System.out.println("NO");
			}
			cases--;
		}
	}

}
