package com.bhaiti.kela.beans;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {
	
	private List<Student> studentRecords;
	
	private static StudentRegistration stdregd=null;
	
	private StudentRegistration() {
		studentRecords = new ArrayList<Student>();
	}

	public static StudentRegistration getInstance() {
		if (stdregd == null) {
			stdregd = new StudentRegistration();
			return stdregd;
		}else {
			return stdregd;
		}
	}
	//Add
	public void add(Student std) {
		studentRecords.add(std);
	}
	//Update
	public String updateStudent(Student std) {
		for (int i = 0; i < studentRecords.size(); i++) {
			Student stdn = studentRecords.get(i);
			if(stdn.getRegistrationNumber().equals(std.getRegistrationNumber())) {
				studentRecords.set(i, std);
				return "Update Successful";
			}
			
		}
		return "Update un-succesful";
	}
	//Delete
	public String deleteStudent(String registrationNumber) {
		for (int i = 0; i < studentRecords.size(); i++) {
			Student stdn = studentRecords.get(i);
			if(stdn.getRegistrationNumber().equals(registrationNumber)) {
				studentRecords.remove(i);
				return "Delete Successful";
			}
			
		}
		return "Delete un-succesful";
	}
	
	public List<Student> getStudentRecords(){
		return studentRecords;
	}
}
