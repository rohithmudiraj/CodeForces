import java.util.Scanner;

public class _0135Borze {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String output="";
		while(input.length()>0) {
			if(input.startsWith(".")) {
				output+="0";
				input=input.replaceFirst(".","");
			}
			else if(input.startsWith("-.")) {
				output+="1";
				input=input.replaceFirst("-.","");
			}
			else if(input.startsWith("--")) {
				output+="2";
			input=	input.replaceFirst("--","");
			}
	//		System.out.println(input);
		}
		System.out.println(output);
	}

}
