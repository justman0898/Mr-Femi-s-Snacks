import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Scanner;

public class PayRollConsole{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many employees do you have?: ");
		int staff = scanner.nextInt();
		
		PayrollFunctions[] employees = new PayrollFunctions[staff];
		
		IntStream.rangeClosed(0, (employees.length - 1))	
			 .forEach(count-> employees[count] = new PayrollFunctions());

		boolean running = true;
		while(running){
			System.out.print("""
	=== Welcome to this payroll===
	1. Add employee
	2. View employee
	3. Update Employee
	4. Exit
		""");
			int userInput = scanner.nextInt();
			switch(userInput){
				case 1 ->{
					boolean inAdd = true;
					while(inAdd){
						System.out.print("Enter employee index: ");
						int employeeIndex = scanner.nextInt();
						scanner.nextLine();
						int index = employeeIndex - 1;
						System.out.print("Enter employee name: ");
						String name = scanner.nextLine();
						if(PayrollFunctions.checkName(employees, name)){
							break;
						}
						employees[index].setName(name);
						System.out.print("Enter Hours Worked: ");
						String hours = scanner.nextLine();
						employees[index].setHoursWorked(hours);
						double myDouble = Double.parseDouble(hours);
						if(myDouble > 40.0) break;
						System.out.print("Enter Hourly Pay: ");
						String payRate = scanner.nextLine();
						employees[index].setPayRate(payRate);
						System.out.print("Enter Federal tax: ");
						String fedealTax = scanner.nextLine();
						employees[index].setFederalTax(fedealTax);
						System.out.print("Enter State tax: ");
						String stateTax = scanner.nextLine();
						employees[index].setStateTax(stateTax);
						System.out.print("""
Do you want to continue? 
	1. Yes		2.No
""");
						int userChoice = scanner.nextInt();
						switch(userChoice){
							case 1 ->{
								inAdd = true;
							}
							case 2 ->{
								inAdd = false;		
							}
						}
					}				
				}
				case 2 ->{ boolean inView = true;
					while (inView){
						PayrollFunctions.viewEmployees(employees);
	
						System.out.print("""
Do you want to continue? 
			2.No
""");	
						int userExit = scanner.nextInt();
						scanner.nextLine();
						switch(userExit){
							case 2 -> inView = false;
						} 
					}
		
				}
				case 3 -> {
					boolean inUpdate = true;
					while(inUpdate){
						System.out.print("Enter employee name: ");
						scanner.nextLine();
						String desiredName = scanner.nextLine();
						if(PayrollFunctions.checkName(employees, desiredName)){
							System.out.print("Enter employee index: ");
							int employeeIndex = scanner.nextInt();
							scanner.nextLine();
							int index = employeeIndex - 1;
							System.out.print("Enter employee name: ");
							String name = scanner.nextLine();
							employees[index].setName(name);
							System.out.print("Enter Hours Worked: ");
							String hours = scanner.nextLine();
							employees[index].setHoursWorked(hours);
							double myDouble = Double.parseDouble(hours);
							if(myDouble > 40.0) break;
							System.out.print("Enter Hourly Pay: ");
							String payRate = scanner.nextLine();
							employees[index].setPayRate(payRate);
							System.out.print("Enter Federal tax: ");
							String fedealTax = scanner.nextLine();
							employees[index].setFederalTax(fedealTax);
							System.out.print("Enter State tax: ");
							String stateTax = scanner.nextLine();
							employees[index].setStateTax(stateTax);

							System.out.println("1. End");
							int user = scanner.nextInt();
							switch(user){
								case 1 -> inUpdate = false;

							
							}
						}else{
							break;
						}
					} 

				}
				case 4 -> running = false;

	
			}

		}









	}

}