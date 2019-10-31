package com.wgblackmon.payroll;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wgblackmon
 */

@SpringBootApplication
public class ReactAndSpringDataRestApplication {
	
	final static Logger log = Logger.getLogger(ReactAndSpringDataRestApplication.class);

	public static void main(String[] args) {
		log.debug("ReactAndSpringDataRestApplication.main()");
		SpringApplication.run(ReactAndSpringDataRestApplication.class, args);
	}
}
