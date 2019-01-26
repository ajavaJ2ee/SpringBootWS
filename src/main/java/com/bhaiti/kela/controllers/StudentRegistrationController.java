package com.bhaiti.kela.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhaiti.kela.beans.Student;
import com.bhaiti.kela.beans.StudentRegistration;
import com.bhaiti.kela.beans.SudentRegistrationReply;

@Controller
public class StudentRegistrationController {
	
	@RequestMapping(value="register/student" , method= RequestMethod.POST)
	@ResponseBody
	public SudentRegistrationReply registerStudent(@RequestBody Student student) {
		System.out.println("In registerStudent");
		SudentRegistrationReply stdregreply = new SudentRegistrationReply();
		StudentRegistration.getInstance().add(student);
		stdregreply.setName(student.getName());
		stdregreply.setAge(student.getAge());
        stdregreply.setRegistrationNumber(student.getRegistrationNumber());
        stdregreply.setRegistrationStatus("Successful");
        return stdregreply;
	}
	

}
