import java.util.Scanner;

public class _40Games {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		int[] a= new int[input];
		int[] b= new int[input];

		for(int i=0;i<input;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		int wear=0;
		for(int i=0;i<input;i++) {
			for(int j=0;j<i;j++) {
				if(a[i]==b[j]) {
					wear++;
				}
				if(b[i]==a[j]) {
					wear++;
				}
			}
		}
		System.out.print(wear);
	}

}
