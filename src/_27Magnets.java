import java.util.Scanner;

public class _27Magnets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int magnets =sc.nextInt();
		int previous = sc.nextInt();
		int group=1;
		for(int i=1;i<magnets;i++) {
			int temp=sc.nextInt();
			if(temp!=previous) {
				group++;
			}
			previous =temp;
		}
		System.out.print(group);

}
}
