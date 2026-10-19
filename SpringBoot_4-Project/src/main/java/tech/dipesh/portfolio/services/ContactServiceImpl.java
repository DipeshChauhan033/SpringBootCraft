package tech.dipesh.portfolio.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.dipesh.portfolio.dto.ContactDTO;
import tech.dipesh.portfolio.entities.ContactEntity;
import tech.dipesh.portfolio.repositories.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public ContactEntity saveContact(ContactDTO contactDTO) {
		
		ContactEntity contactEntity = new ContactEntity();
		contactEntity.setName(contactDTO.getName());
		contactEntity.setEmail(contactDTO.getEmail());
		contactEntity.setSubject(contactDTO.getSubject());
		contactEntity.setMessage(contactDTO.getMessage());
		contactEntity.setDatetime(LocalDateTime.now().toString());
		
		return contactRepository.save(contactEntity);
	}

}
