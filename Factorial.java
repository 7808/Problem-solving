package Package2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("Please enter number for which you want factorial");
  
  int n = sc.nextInt();
  int fact = 1;
  
  for(int i = 1;i<=n;i++)
  {
	 fact = fact*i; //1*5
  }
  System.out.println(fact);
	}
	
}
