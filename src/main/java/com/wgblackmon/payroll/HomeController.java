package com.wgblackmon.payroll;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wgblackmon
 * 
 * @Controller marks this class as a Spring MVC controller.
 * 
 * @RequestMapping flags the index() method to support the / route.
 * 
 *                 It returns index as the name of the template, which Spring
 *                 Boot’s autoconfigured view resolver will map to
 *                 src/main/resources/templates/index.html.
 * 
 * 
 */

@Controller
public class HomeController {

	final static Logger log = Logger.getLogger(Employee.class);
	
	@RequestMapping(value = "/")
	public String index() {
		log.debug("HomeController.index()");
		return "index";
	}

}
