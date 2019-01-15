package rest.restservice.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

//@Embeddable
@Entity
//@Table(name = "EMP_TABLE")
public class Employee {
	@Id
	public int employeeID;
	private String employeeName;
	private float Salary;
	@Embedded
	private Address address;

	public Employee() {
	}
	public Employee(int employeeID, String employeeName, float salary, Address address) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		Salary = salary;
		this.address = address;
	}
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
