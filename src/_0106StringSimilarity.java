import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _0106StringSimilarity {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			int n=sc.nextInt();
			sc.nextLine();
			String s= sc.nextLine();
	//		System.out.println(s);
			String temp="";
			int diff=n-1;
			for(int i=0;i<n;i++) {
				System.out.print(s.charAt(n-1));
			}
			System.out.println();
			cases--;
		}
	}

	}

