package Array;

import java.util.Arrays;
import java.util.Scanner;

public class twoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[][] a = new int[2][2];
 Scanner sc = new Scanner(System.in);
 for(int i = 0;i<a.length;i++) //a.length will give no of row

	{
	  for(int j =0;j<a[0].length;j++)

	{
		 a[i][j] = sc.nextInt();
		 }}
 


	 System.out.println(Arrays.deepToString(a));
 
 

	}

}
