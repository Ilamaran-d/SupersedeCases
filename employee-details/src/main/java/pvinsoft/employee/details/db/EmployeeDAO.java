package pvinsoft.employee.details.db;

import org.springframework.data.jpa.repository.JpaRepository;

import pvinsoft.employee.details.model.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

	
}
