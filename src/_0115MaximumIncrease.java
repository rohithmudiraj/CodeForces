import java.util.Scanner;

public class _0115MaximumIncrease {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int length=0;
		int Max=0;
		int prev=sc.nextInt();
		for(int i=0;i<n-1;i++) {
			int temp=sc.nextInt();
		//	System.out.println(prev+" "+temp);

			if(temp>prev) {
				length++;
			}
			else {
				length=0;
			}
			prev=temp;
		//	System.out.println();
			Max =Math.max(Max,length);
			}
		System.out.println(Max+1);
		}
	}

