package sena.jj.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sena.jj.com.model.Usuario;
import sena.jj.com.service.IUsuarioService;

@Controller
@RequestMapping("/usuario")
public class RegistroController {

    @Autowired
    private IUsuarioService usuarioService;

    // Mostrar formulario de registro
    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }

    // Procesar el registro
    @PostMapping("/save")
    public String registrarUsuario(@ModelAttribute Usuario usuario, 
                                 @RequestParam String confirmPassword,
                                 Model model) {
        
        try {
            // Validar que las contraseñas coincidan
            if (!usuario.getPassword().equals(confirmPassword)) {
                model.addAttribute("error", "Las contraseñas no coinciden");
                return "registro";
            }

            // Validar si el email ya existe
            if (usuarioService.existsByEmail(usuario.getEmail())) {
                model.addAttribute("error", "El email ya está registrado");
                return "registro";
            }

            // Guardar usuario
            usuarioService.save(usuario);
            model.addAttribute("success", "¡Registro exitoso! Ahora puedes iniciar sesión");
            
        } catch (Exception e) {
            model.addAttribute("error", "Error al registrar usuario: " + e.getMessage());
        }
        
        return "registro";
    }
}