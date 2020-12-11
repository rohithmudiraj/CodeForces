import java.util.Scanner;

public class _45FoxAndSnake {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m=sc.nextInt();
		int p=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i%2!=0) {
					System.out.print("#");
				}
				else {
					if(p%2!=0) {
						if(j!=m)
							System.out.print(".");
						else
							System.out.print("#");	
					}
					else {
						if(j==1) 
							System.out.print("#");	
						else
							System.out.print(".");	

					}
				}
				
			}
			if(i%2==0) {
				p++;
			}
			System.out.println();
		}
	}

}
