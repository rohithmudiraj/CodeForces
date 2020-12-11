import java.util.Scanner;

public class _35Isyourhorseshoeontheotherhoof {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s="";
		int count=0;
		int i=4;
		while(i>0) {
			int temp=sc.nextInt();
			if(!s.contains(temp+"")){
			s+=temp;
			}
			else {
				count++;
			}
			i--;
		}
		System.out.print(count);
	}

}
