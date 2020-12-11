import java.util.Scanner;

public class _0193TokitsukazeandEnhancement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		char[] arr ={'D','A','C','B'};
		int val=n%4;
		if(val==1) {
			System.out.print(0+" A");
		}
		else if(val==3) {
			System.out.println(2+" A");
		}
		else {
			System.out.print(1+" ");
			System.out.print(arr[val+1]);
		}
	}

}
