import java.util.Scanner;

public class reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner sc = new Scanner(System.in);   //take input from user
	
	int num = sc.nextInt();
	
	//1. using algo
	int rev = 0;
	while(num!=0)
	{
		rev = rev*10 +num%10;
		num= num/10;
	}
	System.out.println("Reverse number is: " + rev);
	
	// using string buffer
	
	StringBuffer sb = new StringBuffer(String.valueOf(rev));
	StringBuffer rev2 = sb.reverse();
	System.out.println("Reverse number is: " + rev2);
	
	//Using String builder
	StringBuilder sb1 = new StringBuilder();
	sb1.append(rev2);
	StringBuilder rev3 =sb1.reverse();
	System.out.println("Reverse number is: " + rev3);
	
	
	}

}
