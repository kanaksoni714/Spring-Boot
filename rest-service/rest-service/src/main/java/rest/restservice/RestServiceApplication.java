package rest.restservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import rest.restservice.entity.Address;
import rest.restservice.entity.Employee;
import rest.restservice.repo.EmployeeRepository;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandline(EmployeeRepository repository) {
		return (args) -> {
			repository.save(new Employee(101, "Kanak", 100000, new Address(110, "Gali", "Sheher", 23144)));
		};

	}
}
