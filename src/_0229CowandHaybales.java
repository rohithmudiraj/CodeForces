import java.util.Scanner;

public class _0229CowandHaybales {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			int n=sc.nextInt();
			int days =sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int count=arr[0];
			
		for(int i=1;i<n;i++) {
					if(arr[i]*i<=days) {
						count+=arr[i];
						days-=arr[i]*i;
					}
					else {
						if(days<i) {
							continue;
						}
						else {
							count+=days/i;
								days=days%i;
						}
					}
				}
		System.out.println(count);
			
			
			
			
			cases--;
		}
	}

}
