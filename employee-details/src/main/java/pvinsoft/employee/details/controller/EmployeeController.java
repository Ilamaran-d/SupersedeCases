package pvinsoft.employee.details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import pvinsoft.employee.details.model.Employee;
import pvinsoft.employee.details.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping("/getEmployees")
	public List<Employee> getEmployees() {
		return service.getEmployees();
	}

	@RequestMapping("/getEmployee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return service.getEmployee(id).get();
	}
	
	@RequestMapping(value = "/addEmployee")
	public Employee addEmployee(@RequestBody String emp) throws Exception {
		Employee employee = new ObjectMapper().readValue(emp, Employee.class);
		return service.addEmployee(employee);
	}
	
//	@CrossOrigin
//	@RequestMapping(value = "/addEmployee")
//	public Employee addEmployee(@RequestParam String emp) throws Exception {
//		Employee employee = new ObjectMapper().readValue(emp, Employee.class);
//		return service.addEmployee(employee);
//	}
	
	
	@RequestMapping("/updateEmployee")
	public Employee updateEmployee(Employee emp) throws Exception {
		//Employee employee = new ObjectMapper().readValue(emp, Employee.class);
		return service.updateEmployee(emp);
	}
	
	@RequestMapping("/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable int id) {
		 service.deleteEmployee(id);
	}
}










