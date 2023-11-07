package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class spiralArray{
public static void main(String[] args)
{
  List<Integer> all = new ArrayList<>();
  int[][] a = { {1,2,3},
	      {2, 4, 5},
              { 1, 3, 9}}; // 1 2 3 5 9 3 1 2 4
      System.out.println(spiral(a));
}
static List<Integer> spiral(int[][] a)
{

List<Integer> al = new ArrayList<Integer>();
int rowstart = 0;
int rowend = a.length-1;
int colstart = 0;
int colend = a[0].length-1;

if(a.length==0 || a == null)
 return al;

while(rowstart<=rowend && colstart<=colend)
{
for(int col = colstart;col<=colend;col++)
{
   al.add(a[rowstart][col]);
}
rowstart++;

for(int row = rowstart;row<=rowend;row++)
{
al.add(a[row][colend]);
}
colend--;
if(rowstart<=rowend)
{
for(int col =colend;col>=colstart;col--)
{
 al.add(a[rowend][col]);
}}
rowend--;

if(colstart<= colend)
	{for(int row =rowend;row>=rowstart;row--)
{
 al.add(a[row][colstart]);
}}
colstart++;

}
return al;
}
}