import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _0168DiverseTeam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[k];
		int j=0;
		Set<Integer> store = new HashSet<>();
		for(int i=0;i<n;i++) {
			int temp=sc.nextInt();
			if(!store.contains(temp)) {
				store.add(temp);
				arr[j++]=i+1;
			}
			if(store.size()==k) {
				break;
			}
		}
		if(store.size()<k) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		for(int i=0;i<k;i++) {
			System.out.print(arr[i]+" ");
		}
		}
	}

}
