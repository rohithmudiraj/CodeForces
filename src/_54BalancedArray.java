import java.util.Scanner;

public class _54BalancedArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases= sc.nextInt();
		
		while(cases-->0) {
			int num=sc.nextInt();
			if((num/2)%2!=0) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
				int j=2;;
				for(int i=1;i<=num/2;i++) {
					System.out.print(j+" ");
					j=j+2;
				}
				
				int val=j-2;
				j=1;
				for(int i=1;i<num/2;i++) {
					System.out.print(j+" ");
					j=j+2;
				}
				System.out.print(val+num/2-1);
				System.out.println();

			}
		}
	}

}
