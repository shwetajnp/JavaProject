package Training;

public class HelloWorld {

	
	
	public static void main(String[] args) {
	
	System.out.println("Employee Payroll Details"); //print statement	
	
	int empId = 40000;
	String fname = "Shweta";
	String lName = "Yadav";
	long mobile = 7734557879l;
	String designation = "Java Developer";
	double salary = 8000.00d, incent = 1250.50d, ftax = 358.25d, stax = 219.00d, insur = 250.40d ;
	
	double totSalary = salary + incent - ftax - stax - insur;
	
	System.out.println("Employee Id    :- " +empId);	
	System.out.println("Employee Name  :- " +"Mrs. " +fname +" "+lName);
	
	System.out.println("Contact Number :- " +mobile);
	System.out.println("Designation    :- " +designation);
	System.out.println("Salary         :- " +salary);
	System.out.println("Overtime       :- " +incent);
	System.out.println("Federal Tax    :- " +ftax);
	System.out.println("State Tax      :- " +"$"+stax);
	System.out.println("Total Salary   :- " +"$"+totSalary);
	
	
	
	}

}
