import java.util.Scanner;

public class _52ILoveusername {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input= sc.nextInt();
		if(input<=1){
			System.out.println(0);
			return;
		}
		int max,min;
		 max=min=sc.nextInt();
		int best=0;
		for(int i=0;i<input-1;i++) {
			int temp=sc.nextInt();
			if(temp>max) {
				best++;
				max=temp;
			}
			if(temp<min) {
				best++;
				min=temp;
			}
			
		}
		System.out.println(best);
	}

}
