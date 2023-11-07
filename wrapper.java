
public class wrapper {
	// type of data type- primitive datatype-int, float,boolean,character
	//non-primtive datatype- String, object , interface,array ,class
	//The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
	//Objects are needed if we wish to modify the arguments passed into a method.
	//string to integer, Integer.pasrseInt(x);
	//String to char- Character.parseInt(x); Boolean.parseBoolean, int to String -String.valueOf(x)
	//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int a = 10, b= 30;
		Integer c= 20 ;
		Integer d = 30; //non-primitive , it is object here
		
		final int f = 10;
		//f=30;- can't change value of primitive data type with final but can be changed for non -primitive(object)
		final int f2; //always initialise while declaring it
		
		//final wrapper rk = new wrapper("raunak");, with non primitive data type we can change value of final but can not reassign
		//rk.name("kumari");
		//rk = new classname("new object")//but we can not reassign  values
	//System.out.println(num);
	
	swap(a,b);
	swap2(c,d);
	System.out.println(a+ " " +b);
	System.out.println(c+ " " +d);
	
		
	}
	static void swap(int a, int b) // this will not swap as in java primitives are pass by value not pass by refrence
	{
		int temp = a; // this a and b is inside scope of this function only
		a=b;
		b= temp;
		
	}
	
	static void swap2(int c, int d)
	{
		int temp = c; // using warpper(object), pass by reference variable, here also it will not change as wrapper objects are final
		        //using final we can make content non changable,variable pay is 2% and make final 
		c=d;
		d= temp;
	}
	 
void fnl()
{
	
	final int f1;
	
}
}
