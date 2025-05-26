import java.util.Arrays;
import java.util.stream.IntStream;
public class SortedSquareFunction{

	public static int[] sortInAscending(int[] array){
		int temp = 0;
		for (int counter = 0; counter < array.length - 1; counter++) {            
           		 for (int count = 0; count <(array.length - counter) - 1; count++) {                
               			 if (array[count] > array[count + 1]) {                    
                    			temp = array[count];
                   			array[count] = array[count + 1];
                    			array[count + 1] = temp;
				}
			}
		}
		return array;
	}

	public static int[] sortSquaresOfArray(int[] array){
		if((array.length == 0) || (array == null)){
			throw new IllegalArgumentException("Array cannot be empty Oga");
		}
		int[] squaresArray = Arrays.stream(array)
		     			   .map( each-> {return each * each;} )
		     			   .toArray();

		int[] sortedArray = sortInAscending(squaresArray);
		
		return sortedArray;
	}

	public static int[] totalOfArray(int[][] scores){
		if((scores.length == 0) || (scores == null)){
			throw new IllegalArgumentException("Array cannot be empty Oga");
		}
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		int count1 = 0;
		int count2 = 0;
		for(int counter = 0; counter < scores.length; counter++){
			for(int count = 0; count < scores[counter].length; count++){
				if (counter == 1) {
					sum2 = sum2 + scores[counter][count];
				}else{
				sum = sum + scores[counter][count];
				}
			}			
		}
	return new int[] {sum,sum2} ;
	}
	
	public static double[] averageOfArray(int[][] scores){
		double average1 = 0;
		double average2 = 0;
		int[] total = SortedSquareFunction.totalOfArray(scores);
		int count = totalCount(scores);
		for (int counter = 0; counter < total.length;){
			for(int j = 0; j < 1; j++){
				if (counter == 1) {
					average1 = (total[counter]/count);
				}else{
					average2 = (total[counter]/count);
				}
			}
		}

	return new double[] {average1, average2};
	}

	public static int totalCount(int[][] scores){
		if((scores.length == 0) || (scores == null)){
			throw new IllegalArgumentException("Array cannot be empty Oga");
		}
		int count1 = 0;
		int count2 = 0;
		for(int counter = 0; counter < scores.length; counter++){
			for(int count = 0; count < scores[counter].length; count++){
				if (counter == 1) {					
					count1++;
				}else{					
					count2++;
				}
			}					
		}
	return count1;
	}




}