
public class reverse_string1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	StringBuilder str = new StringBuilder("Raunak");
	
	

		for(int i =0; i<str.length()/2; i++)
		{
			
			int f=i;
			int e= str.length()-1-i;
			

			char start = str.charAt(i);
			char end = str.charAt(str.length()-1-i);
			
			str.setCharAt(f, end);
			str.setCharAt(e, start);
			
			
		}
		System.out.println(str);
	}


}