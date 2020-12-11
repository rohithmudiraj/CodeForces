import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _0207CanceltheTrains {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		
		while(cases>0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			Set<Integer> store = new HashSet<>();
			for(int i=0;i<n+m;i++) {
				store.add(sc.nextInt());
			}
			
			System.out.println(n+m-store.size());	
			cases--;
		}
	}

}
