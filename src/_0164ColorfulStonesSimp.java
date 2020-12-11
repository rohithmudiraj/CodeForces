import java.util.Scanner;

public class _0164ColorfulStonesSimp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		String instruct = sc.nextLine();
		int j=0;
		for(int i=0;i<instruct.length();i++) {
			if(Character.compare(path.charAt(j),instruct.charAt(i))==0) {
				j++;
			}
		}
		System.out.println(j+1);
	}

}
