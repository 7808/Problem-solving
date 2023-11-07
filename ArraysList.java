import java.util.ArrayList;

public class ArraysList {

	// size is not fixed , internally it has some space
	//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();//not good practive
		ArrayList<Integer> all = new ArrayList<Integer>(20);// good practiver, initial capacity is 20
		
		all.add(30);
		all.add(50);
		all.add(60);
		all.add(80);
		all.add(50);
		all.add(10);
		all.add(0100);
		System.out.println(all);
		System.out.println(all.contains(20));
		all.set(0,99);//0 with 99
		
		all.remove(2);
		System.out.println(all);	
	}

}
