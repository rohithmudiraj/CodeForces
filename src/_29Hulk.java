import java.util.Scanner;

public class _29Hulk {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input =sc.nextInt();
		boolean flag=false;
		String s="";
		if(input==1) {
			System.out.print("I hate it");
			return;
		}
		while(input>0) {
			if(s!="") {
			s=s+" that ";
			}

			if(flag) {
			s=s+"I love ";
			flag=false;
			}
			else {
				s=s+"I  hate ";
				flag=true;
			}
			input--;
		}
		s=s+" it";
		System.out.print(s);
	}

}
