package tech.dipesh.portfolio.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactDTO {
	
	@Size(min = 4,max = 30, message = "Invalid Name Length")
	@NotBlank(message = "Name can not be empty")
	private String name;
	
	@Size(min = 7,max = 50, message = "Invalid Email Length")
	@NotBlank(message = "Emails can not be empty")
	private String email;
	
	@Size(min = 7,max = 50, message = "Invalid Subject Length")
	@NotBlank(message = "Subject can not be empty")
	private String subject;
	
	@Size(min = 10,max = 500, message = "Invalid Message Length")
	@NotBlank(message = "Message can not be empty")
	private String message;
}
