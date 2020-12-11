import java.util.Scanner;

public class _55YetAnotherTwoIntegersProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		while(cases>0) {
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==b) {
			System.out.println(0);
		}else {
		int moves=0;
		int diff=Math.abs(a-b);
		if(diff%10!=0) {
			System.out.println(diff/10+1);
		}
		else {
			System.out.println(diff/10);

		}
		}
		cases--;
		
		}
		 
	}

}
