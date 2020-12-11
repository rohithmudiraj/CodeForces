import java.util.Scanner;

public class _98BustoUdayland {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			String[] arr = new String[n];
			boolean flag=true;
			sc.nextLine();
			for(int i=0;i<n;i++) {
			String temp=sc.nextLine();
			if(temp.contains("OO")&&flag) {
				temp=temp.replaceFirst("OO","++");
				flag=!flag;
			}
			//System.out.println(temp);
			arr[i]=temp;
			}
			if(!flag) {
				System.out.println("YES");
				for(String c:arr) {
					System.out.println(c);
				}
			}
			else {
				System.out.println("NO");
			}
			
	}

}
