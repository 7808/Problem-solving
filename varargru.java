import java.util.Arrays;

public class varargru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  fun(2, 3, 4, 5, 7);
  fun(4,6,8,9,0,0);
  
		
	}
static void fun( int...var)//take any no of arguments

//can be mutiple parameter also but varaible agrument must be at end
{

	
	System.out.println(Arrays.toString(var));
}
}
