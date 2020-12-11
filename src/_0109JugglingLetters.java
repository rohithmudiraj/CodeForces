import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _0109JugglingLetters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			Map<Character,Integer> store = new HashMap<Character,Integer>(); 

			boolean flag=true;

			int n=sc.nextInt();
			sc.nextLine();
			for(int i=0;i<n;i++) {
				String temp=sc.nextLine();
				
				for(char c:temp.toCharArray()) {
					
					store.put(c,store.getOrDefault(c,0)+1);
				}
			}
			for(char c:store.keySet()) {
				if(store.get(c)%n!=0) {
					flag=!flag;
					break;
				}
			}
			if(flag) {
			System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		//	System.out.println(store);
			cases--;
		}
	}

}
