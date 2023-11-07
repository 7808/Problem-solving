
public class Sum_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int a = 25272;
		
		while(a>0)
		{
			sum = sum+a%10;
			a=a/10;
		}

		System.out.println(sum);
	}

}
