package tech.dipesh.portfolio.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String saveContact(@ModelAttribute ContactDTO contactDTO, RedirectAttributes redirectAttributes) {
		contactService.saveContact(contactDTO);
		redirectAttributes.addFlashAttribute("result", "Contact Details  Send Successfully..");
		return "redirect:contact";
	}
	
	
}
