package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TakingAnarrayAsInputAndPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
	

				Scanner sc = new Scanner(System.in);

				int size = sc.nextInt();
				int a[] = new int[size];
				for(int i = 0; i<size;i++)
				{
				 a[i] = sc.nextInt();

				}
System.out.println(Arrays.toString(a));

Arrays.fill(a,0,2,-1);
   
System.out.println(Arrays.toString(a));
	}

}
