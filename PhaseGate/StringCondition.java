public class StringCondition{

	public static int countOccurence(int[] array, int index){
		int count = 0;
		for(int counter = 0; counter < array.length; counter++){
			if(array[counter] == index){
				count++;
			}
		}
		return count;
	}
	public static boolean checkingCondition(String numbers){
		boolean isSatisfies = false;
		int satisfiesCount = 0;
		char[] chNumbers = new char[numbers.length()];
		
		
		for(int counter = 0; counter < numbers.length(); counter++){
			chNumbers[counter] = numbers.charAt(counter);
		}
		String[] stringNumbers = new String[chNumbers.length];
		for(int counter = 0; counter < chNumbers.length; counter++){
			stringNumbers[counter] = String.valueOf(chNumbers[counter]);
		}

		int[] intNumbers = new int[numbers.length()];
		for(int counter = 0; counter< intNumbers.length; counter++){
			double myDouble = Double.parseDouble(stringNumbers[counter]); 
			int intValue = (int)myDouble;
			intNumbers[counter] = intValue;
		}
		for(int index = 0; index < intNumbers.length; index++){			
			int numberOfOccurence = countOccurence(intNumbers, index);
			if(numberOfOccurence == intNumbers[index]){
				isSatisfies = true;
				satisfiesCount++;							
			}	
		}
		if(satisfiesCount == intNumbers.length){   
			return true;
		}
		else{
			return false;
		}
	}

}