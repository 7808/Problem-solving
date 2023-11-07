package Package2;

public class Duplicate_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
   
   int[] a = {1,2,4,5,6,4};
   int dup;
   
   for(int i=0;i<a.length;i++)

	{
	   for(int j=i+1;j<a.length;j++)
	   {
		   if(a[i] ==a[j])
		   {
			   dup = a[i];
			   System.out.println(dup);
		   }
		   }
	   }
	
	
	}
}
