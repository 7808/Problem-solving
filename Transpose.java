package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Transpose{

public static void main(String[] args)
{
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();

int[][] a = new int[n][m];

for(int i =0;i<n;i++)
{
for(int j =0;j<m;j++)
{
   a[i][j]= sc.nextInt();
}
}
System.out.println(Arrays.deepToString(a));
 for(int j =0;j<m;j++)
{
for(int i =0;i<n;i++)
{

    System.out.print(a[i][j]+" ");
}
 System.out.println();
}

}
}