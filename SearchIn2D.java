package Package2;

import java.util.Arrays;

public class SearchIn2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] a = {{1,2},
		{1,7},
		{3,5,6}
		};
		
		int target = 3;
		int[] ans = array(a, target);
		
		System.out.println(Arrays.toString(ans));
		
	}
		
		static int[] array(int[][]a , int target)
		{
		  	for(int row =0;row<a.length;row++) 
		  	{
		  		for(int col =0 ;col<a[row].length;col++)

		  	{
		  			if(target == a[row][col])
		  			{
		  				return new int[]{row,col};
		  			}
		  			}
		  	}
		  	
		  	return new int[]{-1,-1};
		
		
	}

}
