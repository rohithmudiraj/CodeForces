import java.util.Scanner;

public class _0100CombinationLock {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
	String f=sc.nextLine();
	String k=sc.nextLine();
	int moves=0;
	for(int i=0;i<n;i++) {
		int a=Integer.parseInt(f.charAt(i)+"");
		int b=Integer.parseInt(k.charAt(i)+"");
		
		if(a>b) {
		moves+=(Math.min(9-a+b+1, Math.abs(a-b)));
		}else {
			moves+=(Math.min(9-b+a+1, Math.abs(a-b)));
		}
	}
	System.out.println(moves);
	}

}
