import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _0172PointsinSegments {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> store = new TreeSet<Integer>();		
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=0;i<n;i++) {
			int l=sc.nextInt();
			int r=sc.nextInt();
		//	System.out.println(l+" "+r);
			for(int j=l;j<=r;j++) {
				store.add(j);
			}
		}		
		System.out.println(m-store.size());
		for(int i=1;i<=m;i++) {
			if(!store.contains(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
