package es.pildoras.proyecto1.Proyecto1.rest;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


// 1 V4
@RestController

// 2 V5
//@Controller
public class miRestController {
	
	
	// VALUE : Se usa pra inyectar valores a propiedades
	
	@Value("${ceo.pildoras.nombre}")
	private String nombreCEO; 
	
	
	@Value("${url.pildoras}")
	private String urlPildoras; 
	
	
	// Metodo que nos muestra los valores (Value) inyectados
	
	
	@GetMapping("/datoscorporativos")
	public String getDatosCorporativos() {
		return "Nombre del CEO: " + nombreCEO + "<br>" + "Url de la web : " + urlPildoras; 
	}
	
	
	
	
	
	
	// 2 V4
	@GetMapping("/")
	public String saludo() {
		
		return "index"; 
	}
	
	
	// 3 V8 
	@GetMapping("/info")
	public String informacion() {
		
		return "informacion de la pagina"; 
	}
	
//	
//	@GetMapping("/info")
//	@ResponseBody
//	public String informacion() {
//	    return "{\"status\":\"up\"}";
//	}


}
