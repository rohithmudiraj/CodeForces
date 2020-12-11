import java.util.Scanner;

public class _53BuyaShovel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int price= sc.nextInt();
		int singleCoin=sc.nextInt();
		int quantity=0;
		int currentprice=0;
		do{
			if((currentprice-singleCoin)%10==0) {
				System.out.print(quantity);
				return;
			}
			else {
				currentprice+=price;
				quantity++;
			}
//			System.out.println(currentprice);

		}while(currentprice%10!=0) ;
		System.out.println(quantity);
	}

}
