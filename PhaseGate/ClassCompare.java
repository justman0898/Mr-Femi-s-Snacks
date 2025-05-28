import java.util.Arrays;
import java.util.stream.IntStream;
public class ClassCompare {
	
	public static int[] uniqueValueof(int[] array) {
		int num1 = 0;
		int uniqueCount = 0;
		int[] unique = new int[countOf(array)];

		for (int counter = 0; counter < array.length; counter++) {
				num1 = 0;
			for(int count = 0; count < array.length; count++ ){
				if (array[counter] == array[count])
					num1++;
			}

			if(num1 == 1){
			unique[uniqueCount]= array[counter];
			uniqueCount++;
			}
		}
             	return unique;
	}
	public static int sumUniqueNumbersInArray(int[] array){
		int[] uniqueNos = uniqueValueof(array);
		int sum = Arrays.stream(uniqueNos)
			       .sum();	
		return sum;
	}	

	
	public static int countOf(int[] array) {
		int num1 = 0;
		int uniqueCount = 0;
		
		for (int counter = 0; counter < array.length; counter++) {
				num1 = 0;
			for(int count = 0; count < array.length; count++ ){
				if (array[counter] == array[count])
					num1++;

			}

			if(num1 == 1){
			
			uniqueCount++;
			}
		}
             	return uniqueCount;
	}

























}








	







	
