import java.util.Scanner;

public class _07PetyaAndStrings {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		String Str1 =sc.next();
		String Str2 =sc.next();
		int n=Str1.compareToIgnoreCase(Str2);
		
		if(n>0){
			System.out.print(1);
		}
		else if(n<0){
			System.out.print(-1);
		}
		else{
			System.out.print(0);
		}
		
		
			
		}


	}


