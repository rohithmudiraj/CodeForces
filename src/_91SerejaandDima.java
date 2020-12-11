import java.util.Scanner;

public class _91SerejaandDima {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	boolean flag=true;
		int start=0;
		int end=arr.length-1;
		int serajSum=0;
		int dimaSum =0;
		while(start<=end){
			if(arr[start]>arr[end]) {
		int	x= flag?(serajSum+=arr[start]):(dimaSum+=arr[start]);
		start++;
			}
			else {
				int	x= flag?(serajSum+=arr[end]):(dimaSum+=arr[end]);
				end--;
			}
			flag=!flag;
		}
		
		System.out.println(serajSum+" "+dimaSum);
		
	}

}
