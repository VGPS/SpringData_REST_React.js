package com.wgblackmon.payroll;

import org.springframework.data.repository.CrudRepository;

/**
 * @author wgblackmon
 * 
 * The repository extends Spring Data Commons' CrudRepository 
 * and plugs in the type of the domain object and its primary key
 */

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}

