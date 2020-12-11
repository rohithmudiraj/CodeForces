import java.util.Scanner;

public class _0187EvenSubsetSumProblem {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int cases = sc.nextInt();
	while(cases>0) {
		int n=sc.nextInt();
		int even=0;String odd="";
		int count=0;
		for(int i=0;i<n;i++){
			int temp=sc.nextInt();
			if(temp%2==0) {
				even=(i+1);
			}
			else {
				if(count<2) {
					odd+=(i+1)+" ";
					count++;
				}
			}
		}
		if(even>=1) {
			System.out.println(1);
			System.out.println(even);	
		}
		else if(count>=2) {
			System.out.println(2);
			System.out.println(odd);
		}
		else {
			System.out.println(-1);
		}
		cases--;
	}
	}

}
