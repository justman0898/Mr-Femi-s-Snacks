public class ReverseFunction{

	public static void reverseOfString(String word){
		for(int counter = (word.length()-1); counter >= 0; counter--){
			System.out.print(word.charAt(counter));	

		}
	}
	public static void reverseAtdesired(String word, char ch){
		for(int counter = 0; counter < word.length(); counter++){
			
			if(word.charAt(counter) == ch){
				break
			}

		}
	}



}