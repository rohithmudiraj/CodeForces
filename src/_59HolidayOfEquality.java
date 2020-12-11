import java.util.Scanner;

public class _59HolidayOfEquality {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int[] arr = new int[size];
	int max =Integer.MIN_VALUE;
	for(int i=0;i<size;i++) {
		
		arr[i]=sc.nextInt();
		max = Math.max(max, arr[i]);
		
	}
	int equality=0;
	while(size>0) {
		equality+=max-arr[size-1];
		size--;
	}
	System.out.println(equality);
	
}
}
