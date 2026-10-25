package tech.dipesh.portfolio.services;

import java.util.List;

import org.springframework.stereotype.Service;

import tech.dipesh.portfolio.dto.ContactDTO;
import tech.dipesh.portfolio.entities.ContactEntity;


public interface ContactService {
		ContactEntity saveContact(ContactDTO contactDTO);
		boolean isContactEmailExist(String email);
		
		String ifExistEmailThenName(String email);
		
		List<ContactEntity> readAllContacts();
		
		void deleteContactById(int id);
	}
