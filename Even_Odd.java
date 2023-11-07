package Package2;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(i= 0;i<a.length;i++)
			
		{
			a[i] = sc.nextInt();
			
		}
		for(int val :a)
		{
		if(val%2==0)
		{
		     System.out.println("Even number"+" "+val);
		}	
		
		else 
		{
		     System.out.println("Odd number"+" "+val);
		}
		}

	}

}
