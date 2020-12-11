import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _0160TanyaandStairways {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int noOfStairWays=1;
List<Integer> store=new ArrayList<Integer>();
if(n==1) {
	int temp=sc.nextInt();
	System.out.println(noOfStairWays);
	System.out.println(temp);
	return;
}

int prev=sc.nextInt();
int curr=0;
for(int i=0;i<n-1;i++) {
	int temp=sc.nextInt();
	if(temp<=prev) {
		noOfStairWays++;
		store.add(prev);
	}	
	prev=temp;
	if(i==n-2) {
		store.add(prev);
	}
}
System.out.println(noOfStairWays);
if(store.size()>0) {
for(int i:store) {
	System.out.print(i+" ");
}
}
	}
}
