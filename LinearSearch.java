package Package2;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int target = 5;
		int[] a = {1,2,3,4,5};
		int res = ls(a,target);
		System.out.println(res);
	}
		
		static int ls(int[]a, int target)
		{
		
		if(a.length ==0)
		{
			return -1;
		}
		
		for(int i =0;i<a.length;i++)

		{
			if(target == a[i])
			{
				
				return i;//if searching for index use int with method , if value then better to use boolean value
			}
		}
		return -1;
		
	}

}
