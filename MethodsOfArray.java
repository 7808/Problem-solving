package Array;

import java.util.Arrays;
import java.util.List;

public class MethodsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] ar = {14,15,16,18,19,20,21,22,24,27};
int[] ar1 = {14,15,16,18,19,20,21,22,24,27,28};

System.out.println("Arrays are"+ Arrays.toString(ar));  // print elements in one line


//arrays.asList to cover array to list-------------
Integer a[] = new Integer[]{1, 2, 3, 4};
List<Integer> list = Arrays.asList(a);
System.out.println("The list is:" + list);

//--------------binary search(array, element) - will return index of an element
Arrays.sort(ar);
System.out.println(Arrays.binarySearch(ar, 18));

//----binarysearch(array, from , to , element)
Arrays.sort(ar);
int key =29;
System.out.println(key+"found at index"+Arrays.binarySearch(ar, 1, 10 ,key));

//---Arrays.compare(arr1,arra2)
System.out.println(Arrays.compare(ar,ar1));

//---Arrays.copyOf(arr, new length)
System.out.println(Arrays.toString(Arrays.copyOf(ar,20)));//dont need to create new array

//Arrays.copyOfRange(arr, to, from)
System.out.println(Arrays.toString(Arrays.copyOfRange(ar,1,4)));

//---Arrays.deepEquals(arra1, array 2) method
int[][] ary1 = {{14,15,16,18,19,20,21,22,24,27}};
int[][] ary2 = {{14,15,16,18,19,20,21,22,24,27}};

System.out.println(Arrays.deepEquals(ary1, ary2));

//--- equals() method
System.out.println(Arrays.equals(ar, ar1));

//deepHashcode()
int intArr[][] = { { 10, 20, 15, 22, 35 } };

// To get the dep hashCode of the arrays
System.out.println("Integer Array: "
                   + Arrays.deepHashCode(intArr));
	

int Arr1[][] = { { 10, 20, 15, 22, 35 },

{1,2,3,4,4,5}};
System.out.println(Arrays.deepToString(Arr1));
	}

	}
