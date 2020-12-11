import java.util.Scanner;

public class _49NewYearandHurry {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int problems= sc.nextInt();
		int k=sc.nextInt();
		int solved=0;
		int timeLimit=240;
		timeLimit-=k;
		int i=1;
		while(problems>0) {
			if(timeLimit>=i*5) {
				solved++;
				timeLimit-=i*5;
				i++;
			}
			else {
				break;
			}
			problems--;
		}
		System.out.print(solved);;
		
	}

}
