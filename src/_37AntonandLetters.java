import java.util.Scanner;

public class _37AntonandLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String temp="";
		input=input.replace("{", "").replace("}","").replace(", ","").trim();
		for(char c: input.toCharArray()) {
			if(temp.indexOf(c)==-1) {
				temp=temp+c;	
				}
		}
		System.out.println(temp.length());
		
		
	}

}
