
public class count_number_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int a = 125363;
		 int count =0;
		 
		 while(a>0)
		 {
			a= a/10;
			count++;
		 }
		 
		 System.out.println(count);	}

}
