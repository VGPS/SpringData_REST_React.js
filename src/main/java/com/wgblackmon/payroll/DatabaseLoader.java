package com.wgblackmon.payroll;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author wgblackmon
 * 
 *         This class is marked with Spring’s @Component annotation so that it
 *         is automatically picked up by @SpringBootApplication.
 * 
 *         It implements Spring Boot’s CommandLineRunner so that it gets run
 *         after all the beans are created and registered.
 * 
 *         It uses constructor injection and autowiring to get Spring Data’s
 *         automatically created EmployeeRepository.
 * 
 *         The run() method is invoked with command line arguments, loading up
 *         your data.
 * 
 * 
 */

@Component
public class DatabaseLoader implements CommandLineRunner {

	final static Logger log = Logger.getLogger(ReactAndSpringDataRestApplication.class);

	private final EmployeeRepository repository;

	@Autowired
	public DatabaseLoader(EmployeeRepository repository) {
		log.debug("DatabaseLoader.constr() - repository is: " + repository.getClass());
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		log.debug("DatabaseLoader.run()");
		this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
	}
}
