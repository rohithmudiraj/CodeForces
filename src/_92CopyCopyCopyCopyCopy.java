import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _92CopyCopyCopyCopyCopy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases =sc.nextInt();
		
		while(cases>0) {
		int n=sc.nextInt();
		Set<Integer> num = new HashSet<Integer>();
		for(int i=0;i<n;i++) {
		num.add(sc.nextInt());
		}
		System.out.println(num.size());
		cases--;
		}
	}

}
