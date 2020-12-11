import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _0180RemoveDuplicates {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
	List<Integer> store = new ArrayList<>();
	for(int i=0;i<n;i++){
		int temp =sc.nextInt();
		if(store.contains(temp)) {
			store.remove(new Integer(temp));
			store.add(temp);
		}
		else {
			store.add(temp);
		}
	}
	System.out.println(store.size());
	for(int i=0;i<store.size();i++) {
		System.out.print(store.get(i)+" ");
	}
	}

}
