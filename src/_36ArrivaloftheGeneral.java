import java.util.Scanner;

public class _36ArrivaloftheGeneral {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int min=1000;
		int max=0;
		int maxIndex=0;
		int minIndex=0;

		for(int i=0;i<input;i++) {
			int temp=sc.nextInt();
			if(temp>max) {
				max= temp;
				maxIndex=i;
			}
			if(temp<=min) {
				min=temp;
				minIndex=i;
			}
			
		}
		
		if(maxIndex>minIndex) {
			System.out.print(maxIndex-1+(input-minIndex)-1);
		}
		else {
			System.out.print(maxIndex-1+(input-minIndex));

		}
	}

}
