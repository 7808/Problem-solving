package Package2;
public class test{
public static void main (String[] args)
{
     String str = "RAARk";  
     System.out.println(palindrome(str));
}

static boolean palindrome(String str)
{
if(str == null || str.length()==0)
  return true;
 str.toLowerCase();
   for(int i =0;i<=str.length()/2;i++)
    {
       char start = str.charAt(i);
        char end  = str.charAt(str.length()-1-i);
         if(start!=end)
      {
        return false;}}

          return true;

     }
}