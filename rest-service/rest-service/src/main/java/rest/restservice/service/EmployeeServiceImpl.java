package rest.restservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rest.restservice.entity.Employee;
import rest.restservice.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repository;

	@Override
	public List<Employee> getAllEmployees() {

		return repository.findAll();
	}

	@Override
	public void addNewEmployee(Employee employee) {
		repository.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		repository.save(employee);

	}
	
	@Override
	public void deleteEmployee(int employeeID) {
		Employee employee=repository.getOne(employeeID);
		repository.delete(employee);

	}

	@Override
	public Employee getEmployeeByID(int employeeID) {
		return repository.findById(employeeID).get();
	

		
		
	}
}