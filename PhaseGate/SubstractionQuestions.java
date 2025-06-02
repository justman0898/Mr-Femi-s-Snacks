import java.time.LocalTime;
import java.util.InputMismatchException; 
import java.util.Random;
import java.util.Scanner;
public class SubstractionQuestions{
	public static void main(String[] args){
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	int correctCount = 0;
	int newQuestionCount = 0;
	int wrongCount = 0;
	int temp = 0;
	int minuend = 0;
	int subtrahend = 0;
	int answer = 0;
	int result = 0;
	LocalTime today = LocalTime.now();
	System.out.println("Start: " + today.now());
	while (true){
		try{
		minuend = random.nextInt(100);
		subtrahend = random.nextInt(100);

		if (subtrahend > minuend){
			temp = subtrahend;
			subtrahend = minuend;
			minuend = temp;
		}
		newQuestionCount += 1;
		result = minuend - subtrahend;
		System.out.printf("%d  -  %d : %n",minuend, subtrahend);
		System.out.print("Enter an answer: ");
		answer = scanner.nextInt();
		if (answer == result){
			correctCount += 1;		
		}	
		else{	
			answer = scanner.nextInt();
			if (answer == result){
				correctCount += 1;
			}		
			else{
				wrongCount += 1;		
			}
		}
		if (newQuestionCount == 10){
			break;
		}
	}catch(InputMismatchException exception) {
				System.out.println("Invalid Input, Numbers only!");
				scanner.nextLine();
		}
	}
System.out.println("Your total score was " + correctCount);
System.out.println("You failed " + wrongCount);
System.out.println("End: " + today.now());














	}


}