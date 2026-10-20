package tech.dipesh.portfolio.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public String hanleGeneralException(Exception e,RedirectAttributes redirectAttributes,HttpServletRequest httpServletRequest) {
		
		String header = httpServletRequest.getHeader("referer");
		System.out.println(header);    //gives head URL(check in conSole) after something went wrong - used when handle all exception and redirect into particular page when we comes 
		
		redirectAttributes.addFlashAttribute("result", "Something Went Wrong");
		return "redirect:"+header;
	}
}
