import java.util.Scanner;

public class _0131Rewards {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cups=0;
		int medals=0;
		int shelves=0;
		for(int i=0;i<3;i++) {
			cups+=sc.nextInt();
		}
		for(int i=0;i<3;i++) {
			medals+=sc.nextInt();
		}
		int n=sc.nextInt();
	//	System.out.println(cups+" "+medals+" "+n);
		while(medals>10||cups>5) {
			if(medals>10) {
				shelves+=medals/10;

				medals=medals%10;

			}
			if(cups>5) {
				shelves+=cups/5;
				cups=cups%5;
					
			}
			
		}
		if(medals!=0) {
			shelves++;
		}
		if(cups!=0) {
			shelves++;
		}
	//	System.out.println(cups+" "+medals+" "+shelves);

	//	System.out.println(shelves);
		System.out.println(shelves<=n?"YES":"NO");
	}

}
