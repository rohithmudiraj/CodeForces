import java.util.Scanner;

public class _0114AntonAndDigits {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int Two=sc.nextInt();
		int Three=sc.nextInt();
		int Five=sc.nextInt();
		int Six=sc.nextInt();

		int sum=0;
		int noOf256 =Math.min(Two, Math.min(Five, Six));
		sum+=256*noOf256;
		Two-=noOf256;
		int noOf32=Math.min(Two, Three);
		sum+=32*noOf32;
		System.out.println(sum);
		
	}

}
