import java.util.Scanner;

public class _24GeorgeandAccommodation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfRooms =sc.nextInt();
		int accomodate=0;
		for(int i=0;i<noOfRooms;i++) {
			int size = sc.nextInt();
			int capacity = sc.nextInt();
			
			if(capacity-size>=2) {
				accomodate++;
			}
		}
		System.out.print(accomodate);
	}

}
