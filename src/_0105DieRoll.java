import java.util.Scanner;

public class _0105DieRoll {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] a=new String[] {"","1/1","5/6","2/3","1/2","1/3","1/6"};
		int d=Math.max(sc.nextInt(),sc.nextInt());
		System.out.println(a[d]);
		
		
	}

}
