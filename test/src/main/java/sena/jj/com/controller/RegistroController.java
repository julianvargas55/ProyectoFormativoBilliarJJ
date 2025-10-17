package sena.jj.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sena.jj.com.model.Usuario;
import sena.jj.com.service.IUsuarioService;

@Controller
public class RegistroController {
    
    @Autowired
    private IUsuarioService usuarioService;
    
    @GetMapping("/registro")
    public String mostrarRegistro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuario/registro";
    }
    
    @PostMapping("/registro")
    public String procesarRegistro(@ModelAttribute Usuario usuario, Model model) {
        try {
            // Validaciones básicas
            if (usuario.getNombre() == null || usuario.getNombre().trim().isEmpty()) {
                model.addAttribute("error", "El nombre es requerido");
                return "usuario/registro";
            }
            
            if (usuario.getEmail() == null || usuario.getEmail().trim().isEmpty()) {
                model.addAttribute("error", "El email es requerido");
                return "usuario/registro";
            }
            
            if (usuario.getPassword() == null || usuario.getPassword().length() < 6) {
                model.addAttribute("error", "La contraseña debe tener al menos 6 caracteres");
                return "usuario/registro";
            }
            
            // Asegurar que el rol sea correcto
            if (usuario.getRol() == null) {
                usuario.setRol("2");
            }
            
            // Guardar usuario usando el servicio
            usuarioService.guardarUsuario(usuario);
            
            model.addAttribute("exito", "¡Registro exitoso! Ahora puedes iniciar sesión.");
            return "redirect:/?exito=Registro exitoso";
            
        } catch (RuntimeException e) {
            model.addAttribute("error", e.getMessage());
            model.addAttribute("usuario", usuario); // Mantener los datos del formulario
            return "usuario/registro";
        }
    }
}