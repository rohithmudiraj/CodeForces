import java.util.*;
public class _01WaterMelon {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		int x =sc.nextInt();
		x--;
		int y=1;
		while(y<=x){
			if(x%2==0 &&(y)%2==0){
				System.out.println("YES");
				return;
			}
			y++;
			x--;
		}
		System.out.println("NO");
	}

}
