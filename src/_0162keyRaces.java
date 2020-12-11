import java.util.Scanner;

public class _0162keyRaces {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt();
		int v1=sc.nextInt();
		int v2=sc.nextInt();
		int t1=sc.nextInt();
		int t2=sc.nextInt();
		
		int time1=s*v1;
		int time2=s*v2;
	//	System.out.println(time1+" "+time2);

		time1+=2*t1;
		time2+=2*t2;
		if(time1==time2) {
			System.out.println("Friendship");
		}
		else {
		System.out.println(time1<time2?"First":"Second");
		}
	}

}
