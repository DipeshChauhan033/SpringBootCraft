package tech.dipesh.portfolio.services;

import java.util.List;

import tech.dipesh.portfolio.dto.ServiceDto;
import tech.dipesh.portfolio.entities.ServiceEntity;

public interface ServicesService {
	ServiceEntity saveService(ServiceDto serviceDto, String filename);
	
	List<ServiceEntity> readServices();
}
