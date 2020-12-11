import java.util.Arrays;
import java.util.Scanner;

public class _0183Hotelier {
	static int findIndex(int[] arr,boolean flag) {
		int i;
		if(flag) {
		for( i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				break;
			}
		}
		}
		else {
			for( i=arr.length-1;i>=0;i--) {
				if(arr[i]==0) {
					break;
				}
			}
			}
		return i;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.nextLine();
		String input = sc.nextLine();
		
		int[] arr= new int[10];
		for(int i=0;i<n;i++) {
			char temp =input.charAt(i);
			if(temp=='L') {
				arr[findIndex(arr,true)]=1;
			}
			else if(temp=='R') {
				arr[findIndex(arr,false)]=1;
			}
			else {
				arr[Integer.valueOf(temp+"")]=0;
			}
		}
System.out.println(Arrays.toString(arr).replace(", ","").replace("]","").replace("[",""));

		
	}

}
