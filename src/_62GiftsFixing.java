import java.util.Arrays;

import java.util.Scanner;

public class _62GiftsFixing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases>0) {
			int n=sc.nextInt();
			long[] a =new long[n];
			long[] b= new long[n];
			long minA=Integer.MAX_VALUE;
			long minB = Integer.MAX_VALUE;
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
				minA=Math.min(minA, a[i]);
			}
			for(int j=0;j<n;j++) {
				b[j]=sc.nextLong();
				minB=Math.min(minB, b[j]);
			}
			long eat=0;
			for(int l=0;l<n;l++) {
				 long temp = 0 ;

			        if(a[l] > minA){
			            temp = a[l] - minA ;
			        }
			        if(b[l] > minB){
			            temp = Math.max(temp , b[l] - minB) ;
			        }
			        
			        eat+=temp;
			}
			System.out.println(eat);
			cases--;
		}
	}

}
