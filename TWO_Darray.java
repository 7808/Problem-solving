import java.util.Arrays;
import java.util.Scanner;

public class TWO_Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[][] a = new int[2][2];// not req to give colm numbers
   /* int[][] arr = {
    		{1,3},  //array of arrays
    		{2,4,5},
    		{4,6,7,8}};*/
    //input
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<a.length;i++)
    
    {
    	for(int j = 0;j<a[i].length;j++)//for each column in every row
    	{
    		a[i][j] = sc.nextInt();
    	
    	}
    }
    
    
   // output
   
    /* for(int i=0;i<a.length;i++)
    
   {
    	for(int j = 0;j<a[i].length;j++)//for each column in every row
    	{
    		System.out.print(a[i][j]+ " ");
    		
    	}*/
    for(int[] element: a)
    {
    	System.out.println(Arrays.toString(element));
    
    }
    	System.out.println();
    }
	}

