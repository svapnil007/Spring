package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "form";
	}
	
	@RequestMapping("showForm/processFormOne")
	public String processFormOne(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		name = name.toUpperCase();
		String message  = "Welocome " + name;
		model.addAttribute("message", message);
		return "helloword";
	}
	
	/*This is the alternate way out
	 *Spring provides us @RequestParam to read form data and bind it to variable
	 */
	@RequestMapping("showForm/processFormTwo")
	public String processFormOne2(@RequestParam("studentName") String theName, Model model) {	
		theName = theName.toUpperCase();
		String message  = "Welocome " + theName;
		model.addAttribute("message", message);
		return "helloword";
	}
	
	/*Spring has support for form tag these form tag are configurable and we can use
	 * them on web page. They support data binding automatically set data and retrieve data
	 * from java objects and beans. Before we use form tag we must model attribute. This is 
	 * bean that will hold form data for data binding. This will bind form data to bean.
	 */
	
	 @RequestMapping("/showAnotherForm")
	 public String processFormThree(Model theModel) {
		 
		 Student theStudent = new Student();
		 
		 theModel.addAttribute("student", theStudent);
		 /*path="firstName" is binds the form field to property on beans
		  * when form is loaded this will call student.getFirstName(...)
		  * when we submit form it will call student.setFirstName(...)
		  * In html use ${student.firstName} this will call student.getFirstName()
		  */
		 return "student-form";
	 }
	
	 @RequestMapping("showAnotherForm/processAnotherFormOne")
	 public String processFormTwo1(@ModelAttribute("student") Student theStudent) {
		 /*
		  * We are using @ModelAttribute to bind form data to object
		  */
		 System.out.println("Student : " + theStudent.getFirstName() + " " + theStudent.getLastName());
		 return "student-info";
	 }
	
	 	

}
