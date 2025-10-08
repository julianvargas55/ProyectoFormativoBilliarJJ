package sena.jj.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class OlvcontraseñaController {
	
	@GetMapping("/olvcontraseña")
	public String olvcontraseña(){
		return "/olvcontraseña";
	}

}
