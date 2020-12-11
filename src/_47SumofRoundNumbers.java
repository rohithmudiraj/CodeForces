import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _47SumofRoundNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		for(int i=0;i<size;i++) {
		int num = sc.nextInt();
		int count=0;int t=1;
		List<Integer> store= new ArrayList<>();
		while(num>0) {
			if(num%10!=0) {
				count++;
				store.add((num%10)*t);
			}
			t*=10;
			num/=10;
		}
		System.out.println(count);
		for(int c:store) {
			System.out.print(c+" ");
		}
		System.out.println();
	}
	}

}
