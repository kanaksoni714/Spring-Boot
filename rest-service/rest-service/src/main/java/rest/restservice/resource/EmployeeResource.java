package rest.restservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rest.restservice.entity.Employee;
import rest.restservice.service.EmployeeService;

@RestController
@RequestMapping("/employees") // aDDRESSABLE rESOURCE
public class EmployeeResource {

	@Autowired
	private EmployeeService service;

	@PostMapping // Uniform Constraint Interface
	public void addNewEmployee(@RequestBody Employee employee) {
		service.addNewEmployee(employee);
	}

	@GetMapping // uNIFORMcONSTRAINT iNTERFACE
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}

	@PutMapping
	public void updateEmployee(@RequestBody Employee employee) {
		service.updateEmployee(employee);
	}

	@GetMapping("/{employeeID}")
	public Employee getEmployeeByID(@PathVariable int employeeID) {
		return service.getEmployeeByID(employeeID);

	}

	@DeleteMapping("/{employeeID}")
	public void deleteEmployee(@PathVariable int employeeID) {
		service.deleteEmployee(employeeID);
	}

}
