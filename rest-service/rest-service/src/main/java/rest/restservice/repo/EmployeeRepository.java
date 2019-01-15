package rest.restservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rest.restservice.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{



}
