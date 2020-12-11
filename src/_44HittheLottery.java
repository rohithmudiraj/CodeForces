import java.util.Scanner;

public class _44HittheLottery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int[] currency=new int[] {100,20,10,5,1};
		int i=0;
		int bills=0;
		while(amount>0) {
			if(amount>=currency[i]){
				amount-=currency[i];
				bills++;
			}
			else {
				i++;
			}
		}
		System.out.print(bills);
	
	}

}
