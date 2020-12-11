import java.util.Scanner;

public class _12BoyOrGirl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String temp ="";
		
		for(int i=0;i<input.length();i++) {
			if(temp.indexOf(input.charAt(i))==-1) {
				temp =temp+input.charAt(i);
			}
		}
		if(temp.length()%2==0) {
		System.out.println("CHAT WITH HER!");
		}
		else {
			System.out.println("IGNORE HIM!");
		}
	}

}
