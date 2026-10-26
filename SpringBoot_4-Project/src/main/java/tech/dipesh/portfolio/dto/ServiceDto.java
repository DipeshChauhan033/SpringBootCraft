package tech.dipesh.portfolio.dto;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceDto {
	
	@Size(min=2 ,max=35, message="Invalid Title Length")
	@NotBlank(message = "Title cannot be empty")
	private String title;
	
	@Size(min=10 ,max=100, message="Invalid Description Length")
	@NotBlank(message = "Description cannot be empty")
	private String description;
	
	private MultipartFile serviceFile;

}
