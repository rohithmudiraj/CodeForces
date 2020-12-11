import java.util.Scanner;

public class _0203SubtractorDivide {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases =sc.nextInt();
	
		while(cases>0) {
			int n=sc.nextInt();
			int count=0;
			if(n==2) {
				count++;
			}
			else if(n==3) {
				count+=2;
			}
			else {
		a:
			while(n>1) {
				if(n%2==0) {
					count+=2;
					break a;
				}
				else if(n%3==0) {
					count+=3;
					break a;
				}
				else {
				n=n-1;
				count++;
				}
			}
			}
			System.out.println(count);
			cases--;
		}
	}

}
