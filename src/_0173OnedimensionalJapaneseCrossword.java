import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _0173OnedimensionalJapaneseCrossword {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String input =sc.nextLine();
		int count=0;
		int contLen=0;
		List<Integer> store = new ArrayList<>();
		for(int i=0;i<n;i++) {
			char temp =input.charAt(i);
			if(temp =='B'&&contLen==0) {
				count++;
			}
			if(temp=='B') {
				contLen++;
			}
			else {
				if(contLen!=0) {
				store.add(contLen);
				contLen=0;
				}
			}
			
		}
		if(contLen!=0) {
			store.add(contLen);
		}
		System.out.println(count);
		for(int i=0;i<store.size();i++) {
			System.out.print(store.get(i)+" ");
		}
	}

}
