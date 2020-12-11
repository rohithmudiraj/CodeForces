import java.util.Arrays;
import java.util.Scanner;

public class _09HelpfulMaths {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String sum=	sc.nextLine();
int index=0;
	int[] numSort = new int[sum.length()/2+1];
for(char c: sum.toCharArray()) {
	if(c!='+') {
	numSort[index++]=Integer.parseInt(c+"");
	}
}
	Arrays.sort(numSort);
	for(int i=0;i<numSort.length-1;i++) {
		System.out.print(numSort[i]+"+");
	}
	System.out.print(numSort[numSort.length-1]);
	
		
	}

}
