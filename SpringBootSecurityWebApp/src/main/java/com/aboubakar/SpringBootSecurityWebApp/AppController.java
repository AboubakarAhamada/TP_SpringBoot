/**
 * 
 */
package com.aboubakar.SpringBootSecurityWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Aboubakar
 *
 */

@Controller
public class AppController {

	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}
	
	
}
