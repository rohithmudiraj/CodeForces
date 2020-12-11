import java.util.Scanner;

public class _84BlackSquare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=1;i<5;i++) {
			
		arr[i]=sc.nextInt();
		}
		int sum=0;
		sc.nextLine();
		String values = sc.nextLine();
		for(int i=0;i<values.length();i++) {
			sum+=arr[Integer.parseInt(values.charAt(i)+"")];
		}
		System.out.println(sum);
	}

}
