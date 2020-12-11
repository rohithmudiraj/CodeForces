import java.util.Scanner;

public class _0123YetAnotherBookShelf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		
		while(cases>0){
			int n=sc.nextInt();
			int prev=-1;
			int sum=0;
			for(int i=0;i<n;i++)
			{
				int temp=sc.nextInt();

				if(prev==-1&&temp==1) {
					prev=i;
				}
				else if(temp==1) {
					sum+=i-prev-1;
					prev=i;
				}
			//	System.out.println(sum)
			}
			System.out.println(sum);
			
			cases--;
		}
	}
}
