package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entities.EmployeeEntity;
import com.example.demo.service.MyService;

@Controller
public class MyController {
	
	@Autowired
	private MyService myService;
	
	@GetMapping(path = {"index","home"})
	public String HomePage() {
		return "index";
	}
	
	@GetMapping("/registration.do")
	public String openRegistration() {
		return "registration";
	}
	
	@PostMapping("/save_registration.do")
	public String SaveRegistrationData(@ModelAttribute EmployeeDTO employeeDTO, RedirectAttributes ra) {
		
		ra.addFlashAttribute("message", "Information Inserted Successfully..");
		EmployeeEntity storeData = myService.saveData(employeeDTO);
		System.out.println(storeData);
		System.out.println("Regisration Process Completed..");
		return "redirect:registration.do";
	}
}
