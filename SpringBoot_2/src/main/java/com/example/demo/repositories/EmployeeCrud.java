package com.example.demo.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Employee;

public interface EmployeeCrud extends JpaRepository<Employee, Integer>{
	
	@Modifying
	@Transactional
	@Query(value="insert into employee(eid,ename,eaddress,esalary) values(:eid,:ename,:eaddress,:esalary)",nativeQuery = true)
	public int saveAllData(@Param("eid")int eid,@Param("ename")String ename,@Param("eaddress")String eaddress,@Param("esalary")double esalary);
	
	
	@Query(value="select eid,eaddress from employee where esalary<50000 AND ename='ajay vaniya'",nativeQuery = true)
	public List<Object[]> customRead();
	
	//Derived method formate FindByColumnName
	public List<Employee> findByEsalary(int esalary);
	
	public List<Employee> findByEsalaryGreaterThan(int esalary);
	
	
}
