import java.util.Arrays;

public class maxelementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {202,203, 30, 40};
		System.out.println(max(arr));
		 System.out.println(Arrays.toString(arr));

	}
 static int max(int[] arr)
 {
	 
	 int maxval= arr[0];
	 for(int i =0;i<arr.length;i++)
	 {
		 if(arr[i]>maxval)
		 {
			 maxval = arr[i];
		 }
		
	 }
	return maxval;
 }
}
