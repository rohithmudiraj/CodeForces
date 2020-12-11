import java.util.Scanner;

public class _02WayTooLongWords {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int count = sc.nextInt();
	String[] input = new String[count];
	sc.nextLine();
	int i=0;
	while(count>0){
		input[i++]=sc.nextLine();
		count--;
	}
	for(i=0;i<input.length;i++){
	if(input[i].length()>10){
		System.out.println( input[i].charAt(0)+""+(input[i].length()-2)+input[i].charAt(input[i].length()-1));
	}
	else{
		System.out.println(input[i]);
	}
	}
	}
}
