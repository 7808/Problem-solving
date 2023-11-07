package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDArray 
{
public static void main(String[] args)
{
  int[][][] a = new int[2][2][2];
Scanner sc = new Scanner(System.in);
   for(int i =0;i<a.length;i++)
{
for(int j = 0;j<a[i].length;j++)
{
for(int k =0;k<a[i][j].length;k++)
{
a[i][j][k] = sc.nextInt();
}
}
}


	
System.out.println(Arrays.deepToString(a));
        

}
}

