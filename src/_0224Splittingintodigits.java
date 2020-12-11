import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _0224Splittingintodigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> store = new ArrayList<>();
		int index=9;
	for(int i=9;i>0;i--) {
		if(n%i==0) {
			for(int j=0;j<n/i;j++) {
				store.add(i);
			}
			break;
		}
	}
		System.out.println(store.size());
		for(int i=0;i<store.size();i++) {
			System.out.print(store.get(i)+" ");
		}
	}

}
