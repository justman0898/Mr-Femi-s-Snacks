public class HighestInTwoD{

	public static void highestInTwoDfunction(double[][] arrays){
		
		double largest = arrays[0][0];
		int counter = 0;
		int count = 0;

		for(counter = 0; counter < arrays.length; counter++){
			for(count = 0; count < arrays[counter].length; count++){	
				if(arrays[counter][count] > largest){
					largest = arrays[counter][count];
				}
			}
			System.out.println(counter);
			System.out.println(count);
		}

	}








}