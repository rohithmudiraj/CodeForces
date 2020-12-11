import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class _0205Barrels {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			ArrayList<Long> store = new ArrayList<>();
			int n=sc.nextInt();
			int k=sc.nextInt();
			for(int i=0;i<n;i++) {
				long temp =sc.nextInt();
				store.add(temp);
			}
			Collections.sort(store);
//			System.out.println(store);
			int index=store.size()-1;
			long max=store.get(index);
			index--;
			while(k> 0&& store.size()>0) {
				max+=store.get(index);
				index--;
			k--;
			}
			System.out.println(max);	
			cases--;
		}
	}

}
