import java.util.Arrays;
import java.util.Scanner;

public class _0157GregsWorkout {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int chest=0;
		int biceps=0;
		int back=0;
		int i=0;
		int[] arr = new int[3];
		while(n>0) {
		while(n>0) {
			arr[i]+=sc.nextInt();
			n--;
			i++;
			break;
		}
		while(n>0) {
			arr[i]+=sc.nextInt();
			n--;
			i++;
			break;
		}
		while(n>0) {
			arr[i]+=sc.nextInt();
			n--;
			i++;
			break;
		}
			i=0;
			//System.out.println(Arrays.toString(arr));
	}
	if(arr[0]>arr[1]&&arr[0]>arr[2]) {
		System.out.println("chest");
	}
	else if(arr[1]>arr[0]&&arr[1]>arr[2]) {
		System.out.println("biceps");

	}
	else {
		System.out.println("back");
	}
	}
}
