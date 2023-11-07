package Package2;

public class Equality_Of_Arrays {

	public static void main(String[] args) {
	
		
		// TODO Auto-generated method stub
		
		int[] arr = {3,3,3,5,5,8};
		int[] arr1 = {3,3,3,5,5,8};
		
		boolean b1 = equality(arr, arr1);
		System.out.println(b1);
		
	}
		
		static boolean equality(int[] arr, int[] arr1)
		{
			boolean b = false;
		if(arr.length == arr1.length)
		{
	    for(int i = 0;i<arr.length;i++)

		{
	    	if(arr[i]==arr1[i])
	    	{
	    		b = true;
	    		return b;
	    	}
	    	else
	    	{
	    		
	    		return b;
	    	}
	    	
	    	}
		}
		
	if(arr != arr1)
		{
		
			return b;
		}
		
		
			
		return false;
		
		}

	}


