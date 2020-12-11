import java.util.Scanner;

public class _32Drinks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input =sc.nextInt();
		Double value=0.0;
		for(int i=0;i<input;i++) {
			value+=(sc.nextFloat()/100.0)*100;
		}
		System.out.println(value/input);
	}

}
