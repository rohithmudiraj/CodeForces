import java.util.Scanner;

public class _0102cplusEqual {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			
			long a=sc.nextInt();
			long b=sc.nextInt();
			long limit=sc.nextInt();boolean flag=true;
			int i;
			long max=Math.max(a, b);
			long min = Math.min(a, b);
			a=min;
			b=max;
			for( i=0;a<=limit&&b<=limit;i++) {
				if(flag) {
					a=a+b;

				}else {
					b=b+a;
			
				}
				flag=!flag;
			}
			System.out.println(i);
			cases--;
		}
	}

}
