
public class arrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //store 5 roll number then we are using array,
		//array data type will be same and have fixed size
		
		int[] roll = new int[5]; //datatype[] var = new datatype[size]
		                         //[] is telling it is a array 
		    int[] ros;// declaration
		    ros = new int[5];// initializataion, memeory creation in heap memory - runtime(dyamic memory allocation)
		    
		           roll[0]= 10;          //array index starts from 0, it can be continuous or not, jvm decides, heap objects can or can not continuous
		           
		                           // new keyword is used to create an object in heap momory 
		           System.out.println(roll[1]); //by default value, separate memoery in heap 
		                                      //primitive data types can not be broken down , non=primitive data tyep be brokern
		           
		           System.out.println(roll[2]);  
		           // null is a literals, we can assign to string 
		         
		
	}

}
