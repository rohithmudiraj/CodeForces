import java.util.Scanner;

public class _13SoldiersAndBananas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int Totalmoney = sc.nextInt();
		int noOfBananas = sc.nextInt();		
		
		for(int i=1;i<=noOfBananas;i++) {
			if(i==1) {
				Totalmoney-=first;
			}
			else {
				Totalmoney-=i*first;
			}
		}
		if(Totalmoney>=0) {
		System.out.println(0);
		}else {
		System.out.println(Math.abs(Totalmoney));
		}
	}

}
