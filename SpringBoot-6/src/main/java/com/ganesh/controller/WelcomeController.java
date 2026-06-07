package com.ganesh.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ganesh.entity.Student;

@Controller
public class WelcomeController {
	
	
	@GetMapping("/welcome")
	public ModelAndView welcome() {
		
		ModelAndView mav=new ModelAndView();
		
		mav.setViewName("index");
		mav.addObject("name", "Ganesh");
		mav.addObject("lastname", "Garje");
		mav.addObject("students", Arrays.toString(new String[] {"ganesh", "ram","shyam","hari"})); 
		
		return mav;
	}
	
	
	@GetMapping("/register")
	public ModelAndView register() {
		
		ModelAndView mav=new ModelAndView();
		
		mav.setViewName("register");
		mav.addObject("list", List.of(1,2,3,4,5,6,7,8,9));
		
		Student s1=new Student();
		s1.setId(11);
		s1.setName("Ganesh");
		s1.setMarks(90.00);
		
		Student s2=new Student();
		s2.setId(11);
		s2.setName("Ganesh");
		s2.setMarks(90.00);
		
		mav.addObject("student", List.of(s1,s2));
		
		return mav;
	}
	
	
	

}
