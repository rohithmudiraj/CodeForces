import java.util.Scanner;

public class _08BeautifulMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row =0;int column=0;
		while(sc.hasNext()) {
			
			if(sc.nextInt()==1) {
				System.out.print(Math.abs(row-2)+Math.abs(column-2));
			}

			if(column==4) {
				row++;
				column=-1;
			}
			column++;

			
		}
	}

}
