package sena.jj.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class TejoController {
 
 @GetMapping("/tejo")
 public String tejo(){
     return "administrador/indextejo";
 }
}