package com.example.demo;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import com.example.demo.entity.Employee;
import com.example.demo.repositories.EmployeeCrud;

@SpringBootApplication
public class SpringBoot2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(SpringBoot2Application.class, args);
		
		EmployeeCrud bean = ac.getBean(EmployeeCrud.class);
		bean.save(new Employee(102,"Kiran Maliwad","Godhra",45000)); // Also used to update data based on id 
		
//		List<Employee> data = bean.findAll();
//		for(Employee a:data) {
//			System.out.println(a);
//		}
//		
//		System.out.println(" ");
//		List<Employee> sortedData = bean.findAll(Sort.by("esalary").descending());
//		for(Employee a:sortedData) {
//			System.out.println(a);
//		}
		
//		List<Employee> byEsalary = bean.findByEsalary(50000);
//		for(Employee data:byEsalary) {
//			System.out.println(data);
//		}
		
		List<Employee> byEsalaryGreaterThan = bean.findByEsalaryGreaterThan(45000);
		for(Employee data:byEsalaryGreaterThan) {
			System.out.println(data);
		}
		
//		Optional<Employee> byId = bean.findById(101);
//		Employee employeeById = byId.get();
//		System.out.println(employeeById);
		
		System.out.println("Tested..");
		
		//bean.deleteAll(); //Delete all data 
		//bean.deleteById(102);
		
	
		//bean.saveAllData(104, "Dipesh Chauhan", "Ahmedabad", 50000);
		List<Object[]> customRead = bean.customRead();
		for(Object[] data2:customRead) {
			System.out.print("Id: "+ data2[0]);
			System.out.println(" Address: "+data2[1]);
		}
		
	}

}
