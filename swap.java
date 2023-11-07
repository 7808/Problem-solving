package Array;

import java.util.Arrays;

public class swap
{
public static void main(String[] args)
{
  int[] a = {10,203,40,55,3,4,6,22,45};
reverse(a);
  System.out.println(Arrays.toString(a));
}

static void swaparr(int[] a, int i, int j)
{
    a[i] = a[i] + a[j];
    a[j] = a[i] - a[j];
    a[i] = a[i] - a[j];
  
}
//add reverse
static void reverse(int[]a)
{
	int start = 0;
	int end = a.length-1;
	while(start<end)
	{
		swaparr(a, start, end);
		start++;
		end--;
		}
}
}