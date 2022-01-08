package week3.day1;

public class EmployeeDetails {

	int empId1;
	int empId2;
	String employeeName;
	String companyName;
	String Name;
	
	EmployeeDetails(){
	//constructor changing
	 this(10,"Kavi","TCS");
	System.out.println("I am  in Default constructor");
	empId1=1;
	employeeName="Kavi";
	}
	EmployeeDetails(int empId1,String employeeName, String companyName){
		
	}
	
	public static void main(String[] args) {
		EmployeeDetails empDetails= new EmployeeDetails();
		//empDetails.companyName("TCS");
	}

}
