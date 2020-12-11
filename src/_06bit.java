import java.util.Scanner;


public class _06bit {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num =sc.nextInt();
		int x=0;
		sc.nextLine();
		for(int i=0;i<num;i++){
			switch(sc.nextLine()){
				
			case "++X":{
				x++;
				break;
			}
			case "--X":{
			
				x--;
				break;
			}
			case "X++":{
				x++;
				break;
			}
			case "X--":{
				x--;
				break;
			}
			}
		}
		System.out.println(x);
	
	}

}
