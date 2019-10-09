package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// this tells the spring this a mvc controller 


@Controller

//This below is parent mapping and all mapping inside the class will relative to parent mapping
@RequestMapping("/")
public class HomeController{
	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
}
