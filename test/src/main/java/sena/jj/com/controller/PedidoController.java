package sena.jj.com.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api") 
public class PedidoController {

   
    @PostMapping("/guardar-pedido")
    public ResponseEntity<?> guardarPedido(@RequestBody List<Map<String, Object>> productos) {
        
    
        return ResponseEntity.ok(Map.of("mensaje", "Pedido recibido y procesado"));
    }
}