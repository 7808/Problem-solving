
public class Palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		int num = 121;
		int num1= num;
		
		int sum = 0;
		while(num!=0)
		{
			sum = sum*10+ num%10;
			num = num/10;
		}
		
		System.out.println(sum);
		if(sum == num1)
			
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not a Palindrome number");
		}
		
	}

}
