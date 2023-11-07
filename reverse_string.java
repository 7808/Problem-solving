
public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = "Raunak";
     String rev = "";
     //first way
     
     int l = str.length();
     for(int i =l-1;i>=0;i--)
     {
    	 rev = rev+str.charAt(i);
    	
     }
     System.out.println(rev);
	

String str1= "kumari";
//second method - using chracter array
char a[] = str1.toCharArray();
int len= a.length;
String rev1= "";

for(int i =len-1;i>=0;i--)
{
	
	rev1= rev1+a[i];
	
}
System.out.println(rev1);


// using string Buffer
String n = "Assurant";
StringBuffer sb = new StringBuffer(n);

System.out.println(sb.reverse());




	}

	}