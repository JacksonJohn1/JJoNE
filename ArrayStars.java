
public class ArrayStars {

	
	public static void main(String[] args) {
		// Length of elements =no. of stars
		
		int arr[]={8,1,5,7,2};
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i]; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
