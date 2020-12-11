import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _39AntonandPolyhedrons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Icosahedron", 20);
		map.put("Dodecahedron", 12);
		map.put("Octahedron", 8);
		map.put("Cube", 6);
		map.put("Tetrahedron",4);
		int sum=0;
			sc.nextLine();
		for(int i=0;i<input;i++) {
			
			sum+=map.get(sc.nextLine());
			
			

			
		}
		
		System.out.println(sum);
	}

}
