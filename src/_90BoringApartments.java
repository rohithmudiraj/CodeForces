import java.util.Scanner;

public class _90BoringApartments {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases =sc.nextInt();
		
		while(cases>0) {
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=9;i++) {
			String temp=i+"";
			for(int j=0;j<4;j++) {
				sum+=temp.length(); 
				if(n==Integer.parseInt(temp)) {
					System.out.println(sum);
					break;
				}
				temp=temp+i;
			}
		}	
			cases--;
		}
	}

}
