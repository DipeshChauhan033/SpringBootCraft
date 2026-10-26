package tech.dipesh.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.validation.Valid;
import tech.dipesh.portfolio.dto.ServiceDto;
import tech.dipesh.portfolio.services.ContactService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/home")
	public String home() {
		return "admin/adminHome";
		
	}
	
	@GetMapping("/readAllContacts")
	public String readAllContacts(Model model) {
		
		model.addAttribute("contactData",contactService.readAllContacts());
		return "admin/readAllContacts";
	}
	
	@GetMapping("/deleteContactById")
	public String deleteContactById(@RequestParam int id) {
		contactService.deleteContactById(id);
		
		return "redirect:readAllContacts";
	}
	
	@GetMapping("/addService")
	public String addServiceView() {
		return "admin/addService";
	}
	
	@PostMapping("/addService")
	public String addService(@ModelAttribute @Valid ServiceDto serviceDto, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("result" ,"Invalid Input");
			model.addAttribute("errors",bindingResult.getFieldErrors());
			return "admin/addService";
		}
		
		if(serviceDto.getServiceFile()==null || serviceDto.getServiceFile().isEmpty()) {
			System.out.println("Error occurs");
			model.addAttribute("fileError","Please choose file");
			return "admin/addService";
		}
		return "admin/addService";
	}
}
