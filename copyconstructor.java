
public class copyconstructor {
	
	//create an object using another object of same class, passig object in parameter

	public String name;
	
	


	
	public void copyconstructor(String name)
	{
	 this.name= name;
	 
	}
	
	
	public void copyconstructor(copyconstructor nme)
	{
		this.name= nme.name;
		
	}

	
	public static void main(String[] args)
	{
		//copyconstructor copy1 = new copyconstructor("Raunak");
		//System.out.println(copy1.name);
		//copyconstructor copy2 = new copyconstructor(copy1);
		//System.out.println(copy2.name);
	
	}
}
