package sena.jj.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class OlvcontraseñaController {
	
	@GetMapping("/olvcontraseña")
	public String olvcontraseña(){
		return "/usuario/olvcontraseña";
	}

}
