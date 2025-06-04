import java.util.stream.IntStream;
import java.util.Arrays;
public class PayrollFunctions{
	private String[] person = new String[5];

	public void addEmployee(String name, String hoursWorked, String payRate, String federalTax, String stateTax){
		person[0] = name;
		person[1] = hoursWorked;
		person[2] = payRate;
		person[3] = federalTax;
		person[4] = stateTax;
	}
	public String[] getEmployee(){
		return person;
	}
	public String getName(){
		return person[0];
	}
	public double getHoursWorked(){
		double balanceDouble = Double.parseDouble(person[1]);
		return balanceDouble;
	}
	public double getPayRate(){
		double balanceDouble = Double.parseDouble(person[2]);
		return balanceDouble;
	}
	public double getFederalTax(){
		double balanceDouble = Double.parseDouble(person[3]);
		return balanceDouble;
	}
	public double getStateTax(){
		double balanceDouble = Double.parseDouble(person[4]);
		return balanceDouble;
	}
	public void setName(String name){
		this.person[0] = name;
	
	}
	public void setHoursWorked(String hoursWorked){
		double balanceDouble = Double.parseDouble(hoursWorked);
		if(balanceDouble < 0 || balanceDouble > 40.0){
			System.out.println("Invalid value");
		}else{ 
			this.person[1] = hoursWorked;
		}
	}
	public void setPayRate(String payRate){
		double balanceDouble = Double.parseDouble(payRate);
		if(balanceDouble < 0){
			System.out.println("Invalid value");
		}else{ 
			this.person[2] = payRate;
		}
	}
	public void setFederalTax(String federalTax){
		double balanceDouble = Double.parseDouble(federalTax);
		if(balanceDouble < 0){
			System.out.println("Invalid value");
		}else{ 
			this.person[3] = federalTax;
		}
	}
	public void setStateTax(String stateTax){
		double balanceDouble = Double.parseDouble(stateTax);
		if(balanceDouble < 0){
			System.out.println("Invalid value");
		}else{
		this.person[4] = stateTax;
		}
	}
	public static boolean checkName(PayrollFunctions[] employees, String name){
		String newName = name.toLowerCase();
		for(int counter =0 ; counter < employees.length; counter++){
			if (employees[counter].getName() == null){
				return false;
			}
		}
		for(int counter = 0; counter < employees.length; counter++){
			String newName2 = employees[counter].getName();
			String newName3 = newName2.toLowerCase();
			//newName2 = employees[counter][0].toLowerCase();
			
				if(newName3.equals(newName)){ 
					return true;
				}
			
		}
		return false;
	
	}
	public static void viewEmployees(PayrollFunctions[] employees){
		Arrays.stream(employees)
		      .forEach(employee -> {System.out.println("Employee name: " + employee.getName());
		     			   System.out.println("Pay Rate: " + employee.getPayRate());
					   System.out.println("Federal Tax :" + employee.getFederalTax());
					   System.out.println("Hours Worked: " + employee.getHoursWorked());
					   System.out.println("State Tax: " + employee.getStateTax());
					   System.out.println("Gross pay: " + employee.calculateGrossPay());
					   System.out.println("--------------"); 
					   });
	}
	public double calculateGrossPay(){
		double myDouble = Double.parseDouble(person[1]);
		double myDouble2 = Double.parseDouble(person[2]);
		double grossPay = myDouble * myDouble2; 
		return grossPay;
	}
	public double netPay(){
		double myDouble = Double.parseDouble(person[1]);
		double myDouble2 = Double.parseDouble(person[2]);
		double myDouble3 = Double.parseDouble(person[3]);
		double myDouble4 = Double.parseDouble(person[4]);
		double totalDeductions = myDouble3 + myDouble4;
		double grossPay = myDouble * myDouble2;
		double netPay = grossPay - totalDeductions;
		return netPay;
	}
	 








}