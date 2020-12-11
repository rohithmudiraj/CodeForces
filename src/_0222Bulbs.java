import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _0222Bulbs {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			int m=sc.nextInt();
			Set<Integer> store = new TreeSet<Integer>();
			for(int i=0;i<n;i++) {
				int count=sc.nextInt();
				while(count>0) {
					store.add(sc.nextInt());
					count--;
				}		
			}
			
			if(store.size()==m) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
	}

}
