package pvinsoft.employee.details.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "EMP_DETAILS")
public class Employee {

	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Id
	@Column(name = "EMP_ID")
	private int empId;
	
	@Column(name =  "FIRST_NAME")
	private String firstName;
	
	@Column(name =  "LAST_NAME")
	private String lastName;
	
	@Column(name = "DESIGNATION")
	private String designation;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PHONE")
	private String phone;
	
	
	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, String designation, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.email = email;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + id + ", FirstName=" + firstName + ", lastName=" + lastName
				+ ", designation=" + designation + ", email=" + email + ", phone=" + phone + "]";
	} 
}
