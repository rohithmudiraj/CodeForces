import java.util.Scanner;

public class _76ParkLighting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases =sc.nextInt();
		
		while(cases>0) {
			int row=sc.nextInt();
			int column=sc.nextInt();
			
			if(row%2==0 && column%2==0) {
				System.out.println((row*column)/2);
			}
			else if(row%2==0&&column%2!=0) {
				System.out.println((row/2)*column);
			}
			else if(row%2!=0&&column%2==0){
				System.out.println((column/2)*row);

			}
			else {
				System.out.println(((column*row)/2)+1);

			}
			cases--;
		}
		
	}

}
