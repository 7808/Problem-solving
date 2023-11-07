package Array;

import java.util.Arrays;

public class ArrayMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // Array.fill()
		
//1D array
		
	int[] arr = {10,202,40};
	
	Arrays.fill(arr, 10);
	
	System.out.println(Arrays.toString(arr));
	
	
	Arrays.fill(arr,  0, 1,-1);
	
	System.out.println(Arrays.toString(arr));
	
	//2D array
	  int [][]ar = new int [3][4];
	  for(int[] row :ar)
	  {
		  Arrays.fill(row, 2);
		  System.out.println(Arrays.deepToString(ar));
		  
		  }
	  
	  //3 d array
	 int a1[][][] = new int[4][5][6];
	 
	 for(int row[][] : a1)

	 {
		 for(int rowcol[]:row)
		 {
			 Arrays.fill(rowcol, -1);
			 
		 }
	 }
	 System.out.println(Arrays.deepToString(a1));
	 
	 
	 
	 //----Hashcode
	 int[] a = {10,303,50,77};
	 System.out.println(Arrays.hashCode(a));
	 
	 //mismacth()
	 
	 
	 
	 int[] a11 = {10,20,30,50,3};
	 int[]a2= {10,20,50};
	 
	System.out.println(Arrays.mismatch(a11,a2)); 
	
	//arrays.parallelSort
	 int[] a3 = {10,20,30,50};
	 Arrays.parallelSort(a3);
	System.out.println(Arrays.toString(a3));	 
	
	//arrays.sort
	
	Arrays.sort(a11);
	System.out.println(Arrays.toString(a11));	
	//
	 int[]a4= {10,90,50,3,4,5,5,7};
	Arrays.sort(a4,0,3);
	System.out.println(Arrays.toString(a4));	
}
}