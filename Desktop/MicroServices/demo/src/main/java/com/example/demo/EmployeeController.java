package com.example.demo;

import java.util.List;

import javax.xml.ws.Response;

import org.assertj.core.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/employee")
@RestController
public class EmployeeController {

	@RequestMapping(value="/hello",method=RequestMethod.GET,produces="application/xml")
	public Employee hello(){
		return new Employee(1, "naveen",1000);
		
	}
	
}
