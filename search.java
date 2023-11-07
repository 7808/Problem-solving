package Array;

import java.util.Arrays;
import java.util.Scanner;

public class search
{
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
int k=3;
  int n = sc.nextInt();
 int m = sc.nextInt();
 int[][] a = new int[n][m];
{for(int i=0;i<n;i++){
  for(int j =0;j<m;j++)
   a[i][j] = sc.nextInt();}}
System.out.println(Arrays.deepToString(a));

{for(int i=0;i<n;i++){
  for(int j =0;j<m;j++)
    if(a[i][j]==k)
        {
             System.out.println(i+ " " +j);
          }
       }}

}
}




