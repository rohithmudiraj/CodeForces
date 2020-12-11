import java.util.Scanner;

public class _15Tram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalStops = sc.nextInt();
		int max=Integer.MIN_VALUE;
		int tramCapacity =0;
		for(int i=0;i<totalStops;i++) {
			tramCapacity-=sc.nextInt();
			tramCapacity+=sc.nextInt();
			max = Integer.max(max, tramCapacity);
		}
		System.out.println(max);
	}

}
