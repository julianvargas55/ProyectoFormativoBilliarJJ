package sena.jj.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//Para que funcione con: th:href="@{/boli}"
@Controller
public class BoliController {
 
 @GetMapping("/boli")
 public String bolirana(){
     return "administrador/Bolirana";
 }
}