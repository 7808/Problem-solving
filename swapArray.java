import java.util.Arrays;

public class swapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {202,203, 30, 40};
		
         swap(arr,1,2);
	
	 System.out.println(Arrays.toString(arr));
}
		 static void swap(int[] arr, int index1, int index2)

	{
			 int temp = arr[index1];
			arr[index1] = arr[index2];
			
			arr[index2]= temp;
			
			}
		
	}


