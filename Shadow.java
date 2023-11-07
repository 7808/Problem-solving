
public class Shadow {
 static int x= 50;// inside block 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int x = 40;
System.out.println(x);
fun();

		
	}

	static void fun()
	{
		System.out.println(x);//take upper one- shadowing
	}
}
