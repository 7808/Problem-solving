package Package2;

public class Missing_element_Array {
	
	public static void main(String[] args)

	{
		int[] a = {1,2,3,5};
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0; i<a.length;i++)
		{
			sum1 = sum1+a[i];
		}
		for(int i = 1;i<=5;i++)// till last digit of an array
		{
			sum2 = sum2+i;
		}
		
		
	    System.out.println(sum2 - sum1);
	}
}
