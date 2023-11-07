
public class Palindrome_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		String s1 = "aba";
		System.out.println(ispalindrome(s1));
	}		
		static boolean ispalindrome(String s1)
		{
		
			if( s1== null || s1.length()==0)
			{
				return true;
			}
		for(int i =0;i<s1.length()/2;i++) // Rag
		{
			char start = s1.charAt(i);
			
			char end =s1.charAt(s1.length()-1-i);
			
			
		    if(start != end)
		    {
		    	return false;
		    	
		}

}
		return true;
		}
}
