import java.util.Scanner;

public class _0130FreeIceCream {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int people=sc.nextInt();
			long iceCreams =sc.nextInt();
			int distressed=0;;
			
			for(int i=0;i<people;i++) {
				String s=sc.next();
				long temp=sc.nextInt();
				
				 if(s.equals("+")) {
					iceCreams+=temp;
				}
				 else if(iceCreams<temp) {
					distressed++;
				}
				else {
					iceCreams-=temp;
				}
				
		//		System.out.println(iceCreams+" "+distressed);

			}
			System.out.println(iceCreams+" "+distressed);
			
				
				
			
	}

}
