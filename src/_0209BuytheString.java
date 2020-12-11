import java.util.Scanner;

public class _0209BuytheString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		
		while(cases>0) {
			int n=sc.nextInt();
			int c0=sc.nextInt();
			int c1=sc.nextInt();
			int h=sc.nextInt();
			int noOfZeros=0;	
			sc.nextLine();
			String input=sc.nextLine();
			for(char i:input.toCharArray()) {
				if(i=='0') {
					noOfZeros++;
				}
			}
			int noOfOnes=input.length()-noOfZeros;
			int min=(Math.min((noOfOnes*c1+noOfZeros*c0), Math.min(h*noOfZeros+noOfOnes*c1+(noOfZeros*c1), h*noOfOnes+noOfZeros*c0+(noOfOnes*c0))));
			System.out.println(min);

			cases--;
		}
	
	}

}
