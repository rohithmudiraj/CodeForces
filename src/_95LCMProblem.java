import java.util.Scanner;

public class _95LCMProblem {
	
	static int findLCM(int x,int y) {
	int	max = (x > y) ? x : y;
		int n=x;
		while(true) {
			if(max%x==0&&n%y==0) {
				return n;
			}
			n++;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases =sc.nextInt();
		
		while(cases>0) {
		int l=sc.nextInt();
		int r=sc.nextInt();
		
	if(2*l<=r) {
		System.out.println(l+" "+2*l);
	}else {
		System.out.println(-1+" "+-1);
	}
		cases--;
		}
		
	}

}
