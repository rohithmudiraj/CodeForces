import java.util.Scanner;

public class _46LearnfromMath {
	
	  static boolean isPrime(int n) 
	    { 
	        // Corner case 
	        if (n <= 1) 
	            return false; 
	  
	        // Check from 2 to n-1 
	        for (int i = 2; i < n; i++) 
	            if (n % i == 0) 
	                return false; 
	  
	        return true; 
	    } 
	  

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=n/2;
		int b=n-a;
		for(int i=0;i<n/2;i++) {
			if(!isPrime(a)&&!isPrime(b)) {
				System.out.println(a+" "+b);
				return;
			}
			else {
				a--;
				b++;
			}
		}
	}

}
