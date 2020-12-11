import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _0230GukiZandContest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		List<Integer> input = new ArrayList<>();
		Collections.addAll(input, arr); 
		Collections.sort(input,Collections.reverseOrder());
		for(int i=0;i<n;i++) {
			System.out.print(input.indexOf(arr[i])+1+" ");
		}
		
		
	}

}
