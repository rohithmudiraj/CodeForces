import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _93EhabAndGcd {
	
	
	static int[] findLCM_GCD(int n1,int n2){
		int gcd=1;
	    for(int i = 1; i <= n1 && i <= n2; ++i) {
		      // Checks if i is factor of both integers
		      if(n1 % i == 0 && n2 % i == 0)
		        gcd = i;
		    }

		    int lcm = (n1 * n2) / gcd;
		    	return new int[] {lcm,gcd};
		}
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int cases =sc.nextInt();
		
		while(cases>0) {
		int n=sc.nextInt();
	System.out.println(1+" "+(n-1));
		cases--;
		}
	}

}
