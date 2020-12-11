import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _0103CommonSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			
		
			int n= sc.nextInt();
			int m =sc.nextInt();
			List<Integer> store = new ArrayList<>();	
			for(int i=0;i<n;i++) {
				store.add(sc.nextInt());
			}
			boolean flag=true;
			String ore = "";
			for(int j=0;j<m;j++) {
				int temp=sc.nextInt();
				if(store.contains(temp)) {
					if(flag) {
					 ore=1+" "+temp;
					flag=!flag;
					}
				}
			}
			if(flag) {
			System.out.println("NO");
			}
			else {
				System.out.println("YES");
				System.out.println(ore);

		}
			cases--;
		}
	}

}
