package Package2;

public class reverseWords {

	public static void main(String[] args)
	{
		String s = "the sky is blue";
		StringBuilder sb = new StringBuilder();
	       String[] words = s.split(" +");
	        for(int i = words.length-1;i>=0;i--)
	        {
	              sb.append(words[i]+" ");
	             // sb.append(" ");
	               
	                 
	        }
	        System.out.println(sb.toString().trim());
}
}