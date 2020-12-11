import java.util.Scanner;

public class _0140ThereAreTwoTypesOfBurgers {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			int buns=sc.nextInt();
			int beef=sc.nextInt();
			int chicken = sc.nextInt();
			
			int hamBurg = sc.nextInt();
			int chickenBurg =sc.nextInt();
			int profit=0;
			if(hamBurg>=chickenBurg) {
				profit+=Math.min(buns/2, beef)*hamBurg;
				buns-=Math.min(buns/2,beef)*2;
				if(buns>0) {
					profit+=Math.min(buns/2, chicken)*chickenBurg;
				}
			}
			else {
				profit+=Math.min(buns/2, chicken)*chickenBurg;
				buns-=Math.min(buns/2, chicken)*2;
				
				if(buns>0) {
					profit+=Math.min(buns/2, beef)*hamBurg;
				}
			}
			System.out.println(profit);
			cases--;
		}
	}

}
