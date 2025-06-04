import java.util.stream.IntStream;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPayrollFunction{
	private PayrollFunctions[] employees = new PayrollFunctions[3];
	@BeforeEach
	public void setUp(){		
		IntStream.rangeClosed(0, (employees.length - 1))	
			 .forEach(count-> employees[count] = new PayrollFunctions());	
				
		employees[0].addEmployee("Hilary","20","9.75","20","9");
		employees[1].addEmployee("Wande","20","9.75","20","9");
		employees[2].addEmployee("Debola","20","9.75","20","9");		
	}
	@Test
	public void testAddEmployeeFunction(){
		String[] expected = {"Hilary","20","9.75","20","9"}; 	
		assertArrayEquals(expected, employees[0].getEmployee()); 
	}
	@Test
	public void testGetNameFunction(){
		String expected = "Wande"; 	
		assertEquals(expected, employees[1].getName()); 
	}
	@Test
	public void testGetHoursWorkedFunction(){
		double expected = 20.0; 	
		assertEquals(expected, employees[1].getHoursWorked()); 
	}
	@Test
	public void testGetFederalTaxFunction(){
		double expected = 20.0; 	
		assertEquals(expected, employees[2].getFederalTax()); 
	}
	@Test
	public void testGetPayRateFunction(){
		double expected = 9.75; 	
		assertEquals(expected, employees[2].getPayRate());
	}
	@Test
	public void testGetStateTaxFunction(){
		double expected = 9.0; 	
		assertEquals(expected, employees[2].getStateTax()); 
	}
	@Test
	public void testSetName(){
		String name = "John";
		employees[1].setName(name);
		String expected = "John"; 	
		assertEquals(expected, employees[1].getName()); 
	}
	@Test
	public void testHoursWorked(){
		String hours = "-55";
		employees[1].setHoursWorked(hours);
		double expected = 5.0; 	
		assertEquals(expected, employees[1].getHoursWorked()); 
	}
	@Test
	public void testPayRate(){
		String payRate = "10.75";
		employees[1].setPayRate(payRate);
		double expected = 10.75; 	
		assertEquals(expected, employees[1].getPayRate()); 
	}
	@Test
	public void testFederalTaxFunction(){
		String fedealTax = "27.5";
		employees[1].setFederalTax(fedealTax);
		double expected = 27.5; 	
		assertEquals(expected, employees[1].getFederalTax()); 
	}
	@Test
	public void testStateTaxFunction(){
		String stateTax = "27.5";
		employees[1].setStateTax(stateTax);
		double expected = 27.5; 	
		assertEquals(expected, employees[1].getStateTax()); 
	}
	@Test
	public void testGrossPay(){
		employees[1].calculateGrossPay();
		double expected = 195.0;
		assertEquals(expected, employees[1].calculateGrossPay());
	}
	@Test
	public void testNetPay(){
		employees[1].netPay();
		double expected = 166.0;
		assertEquals(expected, employees[1].netPay());
	}






}