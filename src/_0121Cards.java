import java.util.Scanner;

public class _0121Cards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr= new int[5];
		
		sc.nextLine();
		String s=sc.nextLine();
		String zeros="";
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='n') {
				System.out.print(1+" ");
			}
			else if(s.charAt(i)=='z') {
				zeros+="0 ";
			}
		}
		System.out.println(zeros);
	}

}
