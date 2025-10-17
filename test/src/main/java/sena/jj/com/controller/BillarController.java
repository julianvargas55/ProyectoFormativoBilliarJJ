package sena.jj.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class BillarController {
 
 @GetMapping("/billar")
 public String billar(){
     return "administrador/billar";
 }
}