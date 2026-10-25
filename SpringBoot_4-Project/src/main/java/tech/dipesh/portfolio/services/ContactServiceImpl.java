package tech.dipesh.portfolio.services;

import java.time.LocalDateTime;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.dipesh.portfolio.dto.ContactDTO;
import tech.dipesh.portfolio.entities.ContactEntity;
import tech.dipesh.portfolio.repositories.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactRepository contactRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public ContactEntity saveContact(ContactDTO contactDTO) {
		
		// Method 1 : to set data
//		ContactEntity contactEntity = new ContactEntity();
//		contactEntity.setName(contactDTO.getName());
//		contactEntity.setEmail(contactDTO.getEmail());
//		contactEntity.setSubject(contactDTO.getSubject());
//		contactEntity.setMessage(contactDTO.getMessage());
//		contactEntity.setDatetime(LocalDateTime.now().toString());
//		return contactRepository.save(contactEntity);
		
		//Method 2 : using modelmapper
		ContactEntity contactEntity = modelMapper.map(contactDTO, ContactEntity.class);
		contactEntity.setDatetime(LocalDateTime.now().toString());
		return contactRepository.save(contactEntity);
	}

	@Override
	public boolean isContactEmailExist(String email) {
		return contactRepository.existsByEmail(email);
	}

	@Override
	public String ifExistEmailThenName(String email) {
		return contactRepository.printNameIfEmailExists(email);
	}

	@Override
	public List<ContactEntity> readAllContacts() {
		List<ContactEntity> allContactData = contactRepository.findAll();
		return allContactData;
	}

	@Override
	public void deleteContactById(int id) {
		contactRepository.deleteById(id);;
	}
	
	

}
