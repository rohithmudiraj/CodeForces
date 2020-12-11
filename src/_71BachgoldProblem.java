import java.util.Scanner;

public class _71BachgoldProblem {
	
		static boolean isPrime(int n) 
	    { 
	        // Corner case 
	        if (n <= 1) return false; 
	      
	        // Check from 2 to n-1 
	        for (int i = 2; i < n; i++) 
	            if (n % i == 0) 
	                return false; 
	      
	        return true; 
	    } 
		
		static int nextPrime(int n) {
			n++;
			for(int i=n;;i++) {
				if(isPrime(i)) {
					return i;
				}
			}
		}

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		System.out.println(n/2);
		while(n>0) {
			if(n==3) {
				System.out.print(n);
				n=n-3;
				break;
			}
			System.out.print(2);
			n=n-2;
			System.out.print(" ");
		}
		
	}

}
