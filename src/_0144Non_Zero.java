import java.util.Scanner;

public class _0144Non_Zero {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int cases=sc.nextInt();
		while(cases>0) {
		int n=sc.nextInt();
		int steps=0;
		int sum=0;
		for(int i=0;i<n;i++) {
			int temp=sc.nextInt();
			if(temp==0) {
				steps++;
				sum++;
			}
			else {
				sum+=temp;
			}
		}
		if(sum!=0) {
			System.out.println(steps);
		}
		else {
			System.out.println(steps+1);
		}
		cases--;
		}
	}

}
