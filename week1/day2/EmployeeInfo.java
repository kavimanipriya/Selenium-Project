package week1.day2;

public class EmployeeInfo {
// how to give input  name= Kavi and empId=1;
	
	public void getEmployeeDetails(String empName, int empId) {
		
System.out.println(empName+" " +empId);
	}
	
	public void printCompanyAddress()
	{
		System.out.println("chennai");
	}
	public String  getCompanyAddress() {
		System.out.println("I am giving  company Address");
		return "chennai";
		

	}
	public static void main(String[] args) {
	 EmployeeInfo ei= new EmployeeInfo();
	 //String CompanyAddress = ei.printCompanyAddress(); cntrl+2,press L
	 System.out.println (ei.getCompanyAddress());
	 ei.getEmployeeDetails("Kavi","10");

	}

}
