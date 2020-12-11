import java.util.Arrays;
import java.util.Scanner;

public class _25Presents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int friends =sc.nextInt();
		int[] order = new int[friends];
		for(int i=1;i<=friends;i++) {
			order[sc.nextInt()-1]=i;
		}
		System.out.println(Arrays.toString(order).replace(",","").replace("[", "").replace("]", "").trim());
	}

}
