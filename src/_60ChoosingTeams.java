import java.util.Scanner;

public class _60ChoosingTeams {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int years = sc.nextInt();
		int sum=0;
		while(size>0) {
			if(years+sc.nextInt()<=5) {
				sum++;
			}
			size--;
		}
		
		System.out.print(sum/3);
	}

}
