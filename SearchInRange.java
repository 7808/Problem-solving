package Package2;

public class SearchInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str = "Raunak";
      char ch = 'a';
      int start = 1;
      int end = 2;
      
      System.out.println(SS(str,ch,start,end)); 
	}
      
      static boolean SS(String str, char ch, int start, int end)
      {
    	  
    	  if(str.length()==0)

    	  {
    		  return false;
    	  }
      for(int i = start;i<end;i++)

	{
    	  if(ch == str.charAt(i))
    	  {
    		return true;
    	  }
    	  }
      return false;
	}

	

}
