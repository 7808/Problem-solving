package Array;

import java.util.Arrays;

public class rotateArray{

public static void main(String[] args)
{
   int[]a = {5, 2 ,11 ,2, 43, 1, 1, 7};  // 
   int k = 1;
   k =k%a.length;
   reverse(a,0,a.length-1);
   reverse(a,0,k-1);
   reverse(a,k,a.length-1);
   System.out.println(Arrays.toString(a));

}
static void reverse(int[]a, int start, int end)
     {

while(start<=end)
       {
    int temp = a[start];
    a[start]=a[end];
     a[end]= temp;

      start++;
      end--;
       }}
}



