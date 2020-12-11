import java.util.Scanner;

public class _50RestoringThreeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	int[] input = new int[4];
	int max=0;
	for(int i=0;i<4;i++) {
		int temp=sc.nextInt();
		input[i]=temp;
		max=Math.max(max, temp);
	}
	for(int i=0;i<4;i++) {
		if(max>input[i]) {
			System.out.print(max-input[i]+" ");
		}
	}
		
	}

}
