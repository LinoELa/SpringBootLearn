package es.pildoras.proyecto1.Proyecto1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;


// 1 V4
//@RestController

// 2 V5
@Controller
public class miRestController {
	
	// 2 V4
	@GetMapping("/")
	public String saludo() {
		
		return "index"; 
	}
	
	
	// 3 V8 
	@GetMapping("/info")
	public String informacion() {
		
		return "index"; 
	}
	

}
