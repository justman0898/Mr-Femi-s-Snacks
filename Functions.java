public class Functions {
	
	public static int findMultiple(int number) { 
		int fifthMultiple = 0;
		for(int counter = 1; counter < 6; counter++) { 
			fifthMultiple = number * counter;
		}
		return fifthMultiple;
	}

	public static void displayPrimeNumbers() {
		int count;
		int primeCount = 0;
		boolean firstFifty = true;
		int primePrint = 0;
		for(count = 1; firstFifty; count++) {
			primePrint = 0;
			for(int primeCheck = 1; primeCheck <= count; primeCheck++) {
				if(count % primeCheck == 0) 
					primePrint++;
		
			}
				if (primePrint == 2){
					System.out.printf("%3d\t", count);
					primeCount++;
				if (primeCount % 10 == 0)
					System.out.println();
				}
			
			if (primeCount == 50)
				firstFifty = false;
		}
				
	}

	public static String displayAge(int ageYears) {
		final int noDays = 365;
		final int noMonths = 12;
		final int noMinutes = 525_600;
		final int noSeconds = 31_536_000;

		int months = ageYears * noMonths;
		int days = ageYears * noDays;
		long minutes = ageYears * noMinutes;
		long seconds = ageYears * noSeconds;
		
		String result = "Age: " + ageYears + " year(s), " + months + " months, " + days + " days, " + minutes + " minutes, " + seconds + " seconds";
		
		return result;
	}
	
	public static String displayDogAge(String name, int humanYears) {
		final int oneHumanYear = 7;
		int dogYears = humanYears * oneHumanYear;

		String result = name + "'s dog age is " + dogYears;
		return result;

	}

	public static int computeSumofNumber(int number) {
		int sum = 0;
		int digit;
		int count = 0;
		while(number != 0){
			digit = number % 10;
			sum = sum + digit;
			number = number / 10;
		}
		return sum;
	}
	
	public static boolean isLeapYear(int year) { 
		if( (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0) )
			return true;
		
		else 
			return false;
		
	}

	public static String multiplesOfNot5() {
		String result = "";
		for(int count = 2_000; count <= 3_200; count++) {
			if( (count % 7 == 0) && (count % 5 != 0) )
				result += count + "," ;
		}

		return result;
	}













}