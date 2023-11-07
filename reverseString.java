package Package2;

public class reverseString{
public static void main(String[] args)
{

StringBuilder sb = new StringBuilder("Raunak");
 System.out.println(reverse(sb));
}


static StringBuilder reverse(StringBuilder sb)
{
   for(int i =0;i<=sb.length()/2;i++)

{    int startindex  = 0;
     int endindex = sb.length()-1;

   char startchar = sb.charAt(startindex);
    char endchar = sb.charAt(endindex);
    sb.setCharAt(startindex, endchar);
     sb.setCharAt(endindex , startchar);
    
   return sb;
  }return null;
}
}
