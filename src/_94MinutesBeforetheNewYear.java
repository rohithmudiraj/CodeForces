import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _94MinutesBeforetheNewYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cases =sc.nextInt();
		
		while(cases>0) {
		int hours=sc.nextInt();
		int minutes=sc.nextInt();
		int totalTime=1440;
		int spent=(60*hours)+minutes;
		System.out.println(totalTime-spent);
		
		cases--;
		}
	}

}
