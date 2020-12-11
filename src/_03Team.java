import java.util.Scanner;


public class _03Team {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] input = new int[sc.nextInt()];
	sc.nextLine();
for(int i=0;i<input.length;i++){
	input[i]=(Integer.parseInt(sc.nextLine().replaceAll("\\s", "")));
	}
int count=0;
for(int i=0;i<input.length;i++){
	if(input[i]>100||input[i]==11){
		count++;
	}
}
System.out.print(count);
}
}
