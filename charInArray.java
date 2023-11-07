package Package2;

public class charInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str = "Raunak";
      char ch = 'a';
      System.out.println(SS(str,ch)); 
	}
      
      static boolean SS(String str, char ch)
      {
    	  
    	  if(str.length()==0)

    	  {
    		  return false;
    	  }
      for(int i = 0;i<str.length();i++)

	{
    	  if(ch == str.charAt(i))
    	  {
    		return true;
    	  }
    	  }
      return false;
	}

	

}
