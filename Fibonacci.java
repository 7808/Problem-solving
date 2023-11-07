import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //0 , 1, 1, 2, 3, 5,...
		
	int [] a = new int[10];
	
	int n1 = 0;
	int n2 = 1;
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter the length of series");
	int n = sc.nextInt();
	//System.out.print(n1+ " " +n2);
	int sum = 0;
	for(int i =0;i<n;i++)
	{
		sum = n1+n2;
		System.out.print(" "+sum);
		n1= n2;
		n2 = sum;
		
		
	}
	
	}
	
	

}
