import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _0223Taymyriscallingyou {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int  n=sc.nextInt();
		int m=sc.nextInt();
		int z=sc.nextInt();
		int result=0;
		List<Integer> store = new ArrayList<>();
		int count=1;
		while(n*count<=z) {
			store.add(n*count);
			count++;
		}
		count=1;
		while(m*count<=z) {
			if(store.contains(m*count)) {
				result++;
			}
			count++;
		}
		System.out.println(result);
	}

}
