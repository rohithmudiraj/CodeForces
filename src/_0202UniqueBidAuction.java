import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _0202UniqueBidAuction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			boolean flag=false;
			int n=sc.nextInt();
			Map<Integer,Integer> store = new TreeMap<Integer,Integer>();
			
			for(int i=0;i<n;i++) {
				int temp=sc.nextInt();
				if(store.containsKey(temp)) {
					store.put(temp, 0);
				}
				else {
					store.put(temp, i+1);
				}
	//			System.out.println(store);

			}
			int min = -1;
			for( int i:store.keySet()) {
				if(store.get(i)!=0) {
					flag=!flag;
					min=store.get(i);
					break;
				}
			}
			System.out.println(min);
			cases--;
		}
	}

}
