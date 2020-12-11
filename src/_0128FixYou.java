import java.util.Scanner;

public class _0128FixYou {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		
		while(cases>0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			sc.nextLine();
			int count=0;
			for(int i=0;i<n;i++){
				String temp=sc.nextLine();
				for(int j=0;j<m;j++) {
					//System.out.println(i+ " "+j);
					char c=temp.charAt(j);
				//	System.out.print(c);
					if(i==n-1&&c=='D') {
						count++;
					}
					else if(j==m-1&&c=='R') {
						count++;
					}
				}
			}
			System.out.println(count);

			
			
			cases--;
		}
	}

}
