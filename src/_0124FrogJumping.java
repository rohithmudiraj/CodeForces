import java.util.Scanner;

public class _0124FrogJumping {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int cases = sc.nextInt();

while(cases>0) {
long a=sc.nextInt();
long b=sc.nextInt();
long n=sc.nextInt();
long result=(n/2)*(a-b);
if(n%2==0) {
	System.out.println(result);
}
else {
	System.out.println(result+a);
}
	
	
	
	cases--;
}
	}

}
