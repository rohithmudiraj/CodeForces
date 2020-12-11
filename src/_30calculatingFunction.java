import java.util.Scanner;

public class _30calculatingFunction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long input =sc.nextLong();
		long value=0;
		if(input%2==0) {
			value=input/2;
		}
		else {
			value =((input+1)/2)*(-1);
		}
		System.out.println(value);
	}

}
