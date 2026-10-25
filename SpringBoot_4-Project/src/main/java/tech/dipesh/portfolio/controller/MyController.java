package tech.dipesh.portfolio.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import jakarta.validation.Valid;
import tech.dipesh.portfolio.dto.ContactDTO;
import tech.dipesh.portfolio.services.ContactService;
import tech.dipesh.portfolio.services.ContactServiceImpl;

@Controller
@RequestMapping("/client")
public class MyController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	@GetMapping("/services")
	public String services() {
		return "services";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@PostMapping("/saveContact")
	public String saveContact(@ModelAttribute @Valid ContactDTO contactDTO, BindingResult bindingResult ,Model model, RedirectAttributes redirectAttributes) {
		
		//Error show in console
//		List<FieldError> fieldErrors = bindingResult.getFieldErrors();
//		for(FieldError error: fieldErrors) {
//			String field = error.getField();
//			if(field.equals("name")) {
//				@Nullable
//				String defaultMessage = error.getDefaultMessage();
//				System.out.println("Name field contains: "+defaultMessage);
//			}
//		}
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("errors",bindingResult.getFieldErrors());
			return "contact";
		}
		
		if(contactService.isContactEmailExist(contactDTO.getEmail())) {
			String ifExistEmailThenName = contactService.ifExistEmailThenName(contactDTO.getEmail());
			redirectAttributes.addFlashAttribute("result","Already sent by "+ifExistEmailThenName);
			return "redirect:contact";
		}
		
		contactService.saveContact(contactDTO);
		redirectAttributes.addFlashAttribute("result", "Contact Details  Send Successfully..");
		return "redirect:contact";
	}
	
	
}
