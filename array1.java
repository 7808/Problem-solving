import java.util.Arrays;
import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] arr = new int[5];
  
  arr[0] = 100; 
    // use for loop to assign value to take data
  
  Scanner sc = new Scanner(System.in);
  //input
  for(int i = 0;i<arr.length;i++)
  {
  arr[i]= sc.nextInt();
  
  
  }
  
  //output
  //for(int i = 0;i<arr.length;i++)
  {
   //System.out.print( arr[i]+ " ");
  
  //each loop
 /*  for(int j:arr)
   {
	   System.out.print(j);
	   
   }*/
  // System.out.print(arr[5]);//array indexbou of bound
   
   System.out.println(Arrays.toString(arr));// best approach, using arrays class
   
   arr[1] = 19;//change value
   System.out.println(Arrays.toString(arr));
   
   
  }
	}

}
