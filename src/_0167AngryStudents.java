import java.util.Scanner;

public class _0167AngryStudents {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			int n=sc.nextInt();
			sc.nextLine();
			int max=0;
			boolean flag=true;
			int cont=0;
			String input = sc.nextLine();
			char prev=input.charAt(0);
			for(int i=1;i<n;i++) {
				char curr=input.charAt(i);
			//	System.out.println(prev+" "+curr);
				if(prev=='A'&&curr=='P') {
			//		System.out.println("entered");
					flag=false;
					cont=1;
				}
				else if(!flag&&prev=='P'&&curr=='P') {
				cont++;
				}
		//		System.out.println(cont);
				max=Math.max(cont, max);
				prev=curr;
			}
			System.out.println(max);
			
			cases--;
		}
	}

}
