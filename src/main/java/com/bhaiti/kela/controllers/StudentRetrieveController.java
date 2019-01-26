package com.bhaiti.kela.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhaiti.kela.beans.Student;
import com.bhaiti.kela.beans.StudentRegistration;

@Controller
public class StudentRetrieveController {
	
	@RequestMapping(value="/student/allStudent", method=RequestMethod.GET)
	@ResponseBody
	public List<Student> getAllStudents(){
		return StudentRegistration.getInstance().getStudentRecords();
	}
}
