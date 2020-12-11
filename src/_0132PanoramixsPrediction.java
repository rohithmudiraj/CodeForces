import java.util.Scanner;

public class _0132PanoramixsPrediction {
	static boolean isPrime(int n) {
		if(n<2) {
			return true;
		}
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int firstPrime=sc.nextInt();
	int secondPrime =sc.nextInt();
	int i;
	for(i=firstPrime+1;;i++) {
		if(isPrime(i)) {
			break;
		}
	}
//	System.out.println(i);
	System.out.println(i==secondPrime?"YES":"NO");
	}

}
