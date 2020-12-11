import java.util.Scanner;

public class _0211LittleCLoves3I {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		   if(n%3==0)
		   {
		       System.out.printf("%d %d %d\n",1,1,n-2);
		   }
		   else if(n%3==1)
		   {
		       System.out.printf("%d %d %d\n",1,1,n-2);
		   }
		   else if(n%3==2)
		   {
		       System.out.printf("%d %d %d\n",1,2,n-3);
		   }
	}

}
