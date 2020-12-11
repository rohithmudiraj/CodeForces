import java.util.Scanner;

public class _83VanyaandCubes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int n=sc.nextInt();
		int height=0;
		int num=0;int i=1;
		while(n>0) {
			num=num+i;
			i++;
			n-=num;
		//	System.out.println(n);

		}
		if(n<0) {
			System.out.println(i-2);

		}
		else {
			System.out.println(i-1);

		}
	}

}
