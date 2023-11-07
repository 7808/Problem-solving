import java.util.Arrays;

public class PassingInFunction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array is mutable in java
		//.strring is immutable in java
		
		int[] a= {10,20,30};
		
	System.out.println(Arrays.toString(a));
	
       change(a);

	
	System.out.println(Arrays.toString(a));
	
	}
	
	public static void change(int[] arr)
	{
		
		arr[2]= 50;
		
	}
	
}
