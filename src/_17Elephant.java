import java.util.Scanner;

public class _17Elephant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int steps=0;
		while(n>0) {
			if(n>5) {
				steps++;
				n-=5;
			}
			else {
				steps++;
				n=0;
			}
		}
		System.out.println(steps);


	}

}
