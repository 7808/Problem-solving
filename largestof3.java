public class largestof3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int a =10;
		int b=50;
		int c=30;
		
		int max = (a>b)?(a>c?a:c):(b>c?b:c);// max = exp?exp:exp
		System.out.println("Largest is"+max);
	}

}
