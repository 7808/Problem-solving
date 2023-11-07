import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> all = new ArrayList<Integer>(20);
		
		
		//get item
		for(int i=0;i<5;i++)
		{
			all.add(sc.nextInt());
		}
		
		//get item at any index
		System.out.println(all.get(1));
	
		
		
		System.out.println(all);
	}
}
