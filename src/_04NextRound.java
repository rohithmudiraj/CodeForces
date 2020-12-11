import java.util.Scanner;


public class _04NextRound {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[ sc.nextInt()];
		int k = sc.nextInt()-1;
		
		for(int i=0;i<input.length;i++){
			input[i]=sc.nextInt();
		}
		int count =0;
		for(int i=0;i<input.length;i++){
			if(input[i]>=input[k] && input[i]!=0){
				count++;
			}
			else{
				System.out.print(count);
				return;
			}
		}
		System.out.print(count);
	}
}
