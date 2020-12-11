import java.util.Scanner;

public class _78GennadyandaCardGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			String Ontable=sc.nextLine();
			for(int i=0;i<5;i++) {
				String Onhand=sc.next();
			//	System.out.println(Onhand.charAt(0)+" "+Ontable.charAt(0));
				if(Onhand.substring(0,1).equals(Ontable.substring(0,1))||Onhand.substring(1,2).equals(Ontable.substring(1,2))) {
					System.out.println("YES");
					return;
				}
			}
			System.out.println("NO");
			
	}

}
