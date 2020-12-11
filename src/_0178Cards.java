import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class _0178Cards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
int[] a= new int[n];
int[] b= new  int[n];

			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				b[i]=i+1;
			}
			
			for(int i=1;i<=n;i++) {
				for(int j=0;j<n-i;j++) {
		//			System.out.println(j+" "+(j+1));
					if(a[j]>a[j+1]) {
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
						temp=b[j];
						b[j]=b[j+1];
						b[j+1]=temp;
					}
				}
			}
			
		for(int i=0;i<n/2;i++) {
			System.out.println(b[i]+" "+b[n-i-1]);
		}
		
	}

}
