package Package2;

public class MinandMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] a = {1,2,4,8,4,5,};
		
		int min = a[0];
		int max = a[0];
		
		for(int i = 0;i<a.length;i++)

		{
			if(a[i]<min)
			{
				min = a[i];
			}
			
			if(a[i]>max)
			{
				max= a[i];
			}
		}
		
		System.out.println(min+ " "+ max);	}

}
