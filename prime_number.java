import java.util.Scanner;

public class prime_number {
	
	static int i = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(prime(n));
		
	}

	static boolean prime(int n)
	{
		if(n==0 || n==1) {
		return false;
		
	}
	if(n==i)
		
	{
		return true;
	}
			if(n%i==0)
			{
			return false;	
		}i++;
	
		return prime(n);
}
}
