import java.util.Scanner;

public class _57PoliceRecruits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		int noOfpolice=0;
		int untreated=0;
		while(cases>0) {
			int value =sc.nextInt();
	//		System.out.println(value+"---- ");
			if(value>0){
				noOfpolice+=value;
				}
			else {
			if(noOfpolice<=0) {
				untreated++;
			}
			else {
				noOfpolice--;
			}
			}
		//	System.out.println(noOfpolice);
			cases--;
		}
		System.out.println(untreated);
		
	}

}
