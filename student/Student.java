package org.student;

import org.department.Department;

public class Student extends Department {
	public void StudentName() {
		System.out.println("Nandhini");
		
	}
	public void StudentDept() {
		System.out.println("EEE");
	}
	public void StudentId() {
		System.out.println("12345");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.CollegeName();
		obj.CollegeCode();
		obj.CollegeRank();
		obj.deptName();
		obj.StudentName();
		obj.StudentDept();
		obj.StudentId();
		
	

	}
	

}
