package com.raven.webmvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomLoginController {

	@GetMapping("/showCustomLoginPage")
	public String showCustomLoginPage() {
		return "customLoginForm";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String showNewEmployeeForm(Model model) {
		return "signup";
	}
}
