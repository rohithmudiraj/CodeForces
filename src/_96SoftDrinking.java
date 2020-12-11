import java.util.Scanner;

public class _96SoftDrinking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nOfFriends =sc.nextInt();
		int noOfBottles =sc.nextInt();
		int NoofMMperBottle =sc.nextInt();
		int nOfLimes =sc.nextInt();
		int nOfSlices =sc.nextInt();
		int GramsOfSalt =sc.nextInt();
		int toastMMDrink =sc.nextInt();
		int toastMMSalt =sc.nextInt();
		
		
		int toast=(noOfBottles*NoofMMperBottle)/toastMMDrink;
		int toast2=nOfLimes*nOfSlices;
		int toast3 =GramsOfSalt/toastMMSalt;
		
		System.out.println(Math.min(toast,Math.min(toast2, toast3))/nOfFriends);

	}

}
