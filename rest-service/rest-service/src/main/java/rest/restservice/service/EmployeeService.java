package rest.restservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import rest.restservice.entity.Employee;

@Service
public interface EmployeeService {

	List<Employee> getAllEmployees();

	void addNewEmployee(Employee employee);

	void updateEmployee(Employee employee);

	void deleteEmployee(int employeeId);

	Employee getEmployeeByID(int employeeID);

}