package sena.jj.com.service;

import sena.jj.com.model.Usuario;
import sena.jj.com.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        // Verificar si el email ya existe
        if (usuarioRepository.existsByEmail(usuario.getEmail())) {
            throw new RuntimeException("El email ya está registrado");
        }
        
        // CORRECCIÓN: NO establecer rol por defecto, mantener el que ya tiene
        // Si el usuario es nuevo y no tiene rol, entonces poner "USUARIO"
        if (usuario.getRol() == null) {
            usuario.setRol("USUARIO");
        }
        
        if (usuario.getActivo() == null) {
            usuario.setActivo(true);
        }
        
        // Guardar el usuario
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario buscarForEmailYPassword(String email, String password) {
        Optional<Usuario> usuarioOpt = usuarioRepository.findByEmail(email);
        
        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            
            // Verificar si el usuario está activo
            if (!usuario.getActivo()) {
                throw new RuntimeException("Usuario desactivado");
            }
            
            // Verificar contraseña
            if (usuario.getPassword().equals(password)) {
                return usuario;
            } else {
                throw new RuntimeException("Contraseña incorrecta");
            }
        } else {
            throw new RuntimeException("Usuario no encontrado");
        }
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public boolean existePorEmail(String email) {
        return usuarioRepository.existsByEmail(email);
    }

    @Override
    public Usuario buscarPorEmail(String email) {
        Optional<Usuario> usuarioOpt = usuarioRepository.findByEmail(email);
        return usuarioOpt.orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }
}