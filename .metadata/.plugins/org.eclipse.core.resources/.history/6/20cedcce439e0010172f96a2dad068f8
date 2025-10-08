package sena.jj.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sena.jj.com.model.Usuario;
import java.util.Optional;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
    boolean existsByEmail(String email);
}