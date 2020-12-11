import java.util.Scanner;

public class _11StonesInTheTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String input = sc.nextLine();
		int count=0;
		for(int i=0;i<n-1;i++) {
			if(input.charAt(i)==input.charAt(i+1)){
				count++;
			}
		}
		
		System.out.println(count);

	}

}
