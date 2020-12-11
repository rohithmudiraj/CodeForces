import java.util.Scanner;

public class _34IWannaBetheGuy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxLevel =sc.nextInt();
		String s="";
		int first=sc.nextInt();
		for(int i=0;i<first;i++) {
			s=s+sc.nextInt();
		}
		int second = sc.nextInt();
		for(int i=0;i<second;i++) {
			s=s+sc.nextInt();
		}
		for(int i=1;i<=maxLevel;i++) {
			if(s.indexOf(Integer.toString(i))==-1){
				System.out.println("Oh, my keyboard!");
				return;
			}
		}
		System.out.println("I become the guy.");

		
	}

}
