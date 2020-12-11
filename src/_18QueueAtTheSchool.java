import java.util.Scanner;

public class _18QueueAtTheSchool {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		sc.nextLine();
		String queue = sc.nextLine();
		while(t>0) {
			if(queue.contains("BG")){
				queue=queue.replace("BG", "GB");
				
			}
			t--;
		}
		System.out.println(queue);
		
	}

}
