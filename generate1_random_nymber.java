import java.util.Random;

public class generate1_random_nymber {

	public static void main (String[] args)
	{
		
	Random ran = new Random();
	
	int a = ran.nextInt(1000);//give no of digits between( 0-9)
	
	System.out.println(a);
	
	//create random class
	
	//approach 2
	System.out.println(Math.random());
}

}