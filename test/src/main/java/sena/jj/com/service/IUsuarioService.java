package sena.jj.com.service;

import sena.jj.com.model.Usuario;
import java.util.List;

public interface IUsuarioService {
    Usuario guardarUsuario(Usuario usuario);
    Usuario buscarForEmailYPassword(String email, String password); // Nombre corregido
    List<Usuario> findAll();
    boolean existePorEmail(String email);
    Usuario buscarPorEmail(String email);
}