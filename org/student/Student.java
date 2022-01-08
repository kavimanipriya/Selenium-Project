package org.student;

import org.department.Department;

public class Student extends Department {

	//Methods   :studentName(),studentDept(),studentId()
	
	public void studentName() {
		System.out.println("Student Name is Kavi");

	}
	public void studentDept() {
		System.out.println("Student Dept is IT");

	}
	public void studentId() {
		System.out.println("Student Id is 7");

	}
	public static void main(String[] args) {
		
		Student st  = new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentDept();
		st.studentId();
		st.studentName();

	}

}
