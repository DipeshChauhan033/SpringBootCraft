package tech.dipesh.portfolio.controller;

import java.io.File;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import tech.dipesh.portfolio.dto.ServiceDto;
import tech.dipesh.portfolio.services.ContactService;
import tech.dipesh.portfolio.services.ServicesService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private ServicesService servicesService;
	
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
	public String addService(@ModelAttribute @Valid ServiceDto serviceDto, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes,HttpServletRequest request) throws Exception {
		
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
		
		MultipartFile multipartFile = serviceDto.getServiceFile();
		long size = multipartFile.getSize();
		if(size>(1*1024*1024)) {
			model.addAttribute("fileError", "File size must not axceed 1MB");
			return "admin/addService";
		}
		
		String realPath = request.getServletContext().getRealPath("img/services/");
		String originalFileName = UUID.randomUUID().toString()+ LocalDateTime.now().toString().replace(":", "-") + serviceDto.getServiceFile().getOriginalFilename();
		
		Path path = Paths.get(realPath, originalFileName);
		File file = path.toFile();
		
		multipartFile.transferTo(file);
		
		servicesService.saveService(serviceDto, originalFileName);
		redirectAttributes.addFlashAttribute("result", "Service added successfully");
		
		return "redirect:addService";
	}
}
