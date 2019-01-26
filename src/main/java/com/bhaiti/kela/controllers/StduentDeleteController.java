package com.bhaiti.kela.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhaiti.kela.beans.StudentRegistration;

@Controller
public class StduentDeleteController {

	@RequestMapping(value="delete/student/{regNum}", method=RequestMethod.DELETE)
	@ResponseBody
	public String deleteStudent(@PathVariable("regNum") String regNum) {
		return StudentRegistration.getInstance().deleteStudent(regNum);
	}
}
