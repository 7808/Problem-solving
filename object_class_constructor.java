
public class object_class_constructor {
	
	static int roll;
	static String name;
	
	object_class_constructor(int roll, String name)
	{
		this.roll= roll; // same name then use this keyword to avoid confusion , it refer to current object
		this.name= name;
	}
	object_class_constructor()//call another constructor using this keyword
	{
		this(13,"Default person name");
	}
	//Class= Template of objects- logical construct
			//Objects are instances on class, real entity

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //object raunak = new object();//by default constructor.Constructors are automatically called at the time of object creation
  //System.out.println(raunak.roll);
 // System.out.println(raunak.name); 
		
		
		//in order to access class variables of specific object we will this keyword. I basically replaces object refernce 
		object_class_constructor raunak = new object_class_constructor(15,"Raunak");
		 System.out.println(raunak.roll+ " " +raunak.name); 
		 
		 object_class_constructor random = new object_class_constructor();
		 System.out.println(random.name);
		 
		
	}}

  //object variable is repeatitive so we can use constructor.when we have many numbers of properties
  //at the time of object create initiaze all value of instance vaiable
  //parameterized constructor- bind all class variable with object 
 

