package week3.day1;

public class Students {
	
	
		
	public void getStudentInfo(int id) {
		System.out.println("Student id is: " + id);

	}

	public void getStudentInfo(int id, String name) {
		
		System.out.println("Student id is:  " + id);
		System.out.println("Student Name is: " + name);

	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student email is: " + email);
		System.out.println("Student Phone Number is: " + phoneNumber);

	}

	public static void main(String[] args) {
		Students stdinfo = new Students();
		stdinfo.getStudentInfo(7);
	
		stdinfo.getStudentInfo(7,"Priya");
		stdinfo.getStudentInfo("kavi@gmail.com",8220857936L);
		
		
		

	}

}
