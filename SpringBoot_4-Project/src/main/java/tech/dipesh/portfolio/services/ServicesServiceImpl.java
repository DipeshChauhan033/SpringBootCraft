package tech.dipesh.portfolio.services;

import java.time.LocalDateTime;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.dipesh.portfolio.dto.ServiceDto;
import tech.dipesh.portfolio.entities.ServiceEntity;
import tech.dipesh.portfolio.repositories.ServiceRepository;

@Service
public class ServicesServiceImpl implements ServicesService{
	
	@Autowired
	private ServiceRepository serviceRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public ServiceEntity saveService(ServiceDto serviceDto, String filename) {
		ServiceEntity serviceEntity = modelMapper.map(serviceDto, ServiceEntity.class);
		serviceEntity.setFilename(filename);
		serviceEntity.setDatetime(LocalDateTime.now().toString());
		
		return serviceRepository.save(serviceEntity);
	}

	@Override
	public List<ServiceEntity> readServices() {
		// TODO Auto-generated method stub
		return serviceRepository.findAll();
	}

}
