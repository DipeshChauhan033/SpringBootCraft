package tech.dipesh.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tech.dipesh.portfolio.entities.ContactEntity;
import java.util.List;


@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, Integer>{
	
	boolean existsByEmail(String email);
	
	@Query(value="select name from contact_details where email=:email",nativeQuery = true)
	public String printNameIfEmailExists(@Param(value = "email") String email);
}
