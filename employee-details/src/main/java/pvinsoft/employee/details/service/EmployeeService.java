package pvinsoft.employee.details.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;

import pvinsoft.employee.details.db.EmployeeDAO;
import pvinsoft.employee.details.model.Employee;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	EmployeeDAO dao;
	
	public List<Employee> getEmployees() {
		
		return dao.findAll();
	}

	public Optional<Employee> getEmployee(int id) {
		
		return dao.findById(id);
	}
	
	public Employee addEmployee(Employee emp) throws Exception {
		
		return dao.save(emp);
	}
	
	
	public Employee updateEmployee(Employee emp) throws Exception {
		
		return dao.save(emp);
	}
	
	public void deleteEmployee(int id) {
		 dao.deleteById(id);;
	}
	
	
 /** Deserializes an Object of class Employee from its JSON representation 
 * @throws Exception */
   public Employee fromString(String jsonRepresentation) throws Exception {
       ObjectMapper mapper = new ObjectMapper(); //Jackson's JSON marshall
       try {
             return mapper.readValue(jsonRepresentation, Employee.class );
       } catch (IOException e) {
                throw new Exception();
	   }
   }
}
