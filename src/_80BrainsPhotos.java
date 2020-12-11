import java.util.Scanner;

public class _80BrainsPhotos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String temp=sc.nextLine();
		//	System.out.println(temp);
			if(temp.contains("C")||temp.contains("M")||temp.contains("Y")) {
				System.out.println("#Color");
				return;
			}
		}
		System.out.println("#Black&White");
		
	}

}
