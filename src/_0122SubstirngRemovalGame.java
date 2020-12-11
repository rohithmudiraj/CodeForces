import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _0122SubstirngRemovalGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		while(cases>0) {
		String patt = sc.nextLine()+"0";
		int curr=0;
		List<Integer> store = new ArrayList<>();
		for(int i=0;i<patt.length();i++) {
			if(patt.charAt(i)=='1') {
				curr++;
			}
			else {
				store.add(curr);
				curr=0;
			}
		}
		Collections.sort(store,Collections.reverseOrder());
		
	//	System.out.println(store);
		int Alice=0;
		for(int i=0;i<store.size();i+=2) {
			Alice+=store.get(i);
		}
		System.out.println(Alice);
			cases--;
		}
	}

}
