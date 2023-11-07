package Array;

import java.util.Scanner;
import java.util.Arrays;

public class Naame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Take an array of names as input from the user and print them on the screen.
		
		 Scanner sc = new Scanner(System.in);
		 int size = sc.nextInt();
		 String name[] = new String[size];

		 for(int i =0;i<size;i++)
		 {
		 name[i] = sc.next();
		 }
		  
		 
		 System.out.println(Arrays.toString(name));  /// we dont need another for loop to print
		 }

}
