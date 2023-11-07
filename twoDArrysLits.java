import java.util.ArrayList;
import java.util.Scanner;

public class twoDArrysLits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();//not good practive
		ArrayList<ArrayList<Integer>> all = new ArrayList<>(20);//Arrys of arrys list
		Scanner sc = new Scanner(System.in);
		//initialize , without inilization we will get error
		for(int i = 0;i<5;i++)

	{
		all.add(new ArrayList<>())	;
	}
		
		//add element
		
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				all.get(i).add(sc.nextInt());
			}
		}
		System.out.println(all);
	}
}
