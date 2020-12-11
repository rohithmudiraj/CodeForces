import java.util.Scanner;

public class _26VanyaandFence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int friends =sc.nextInt();
		int Height = sc.nextInt();
		int width=0;
		for(int i=0;i<friends;i++) {
			if(sc.nextInt()<=Height) {
				width++;
			}
			else {
				width+=2;
			}
		}
		System.out.println(width);
	}

}
