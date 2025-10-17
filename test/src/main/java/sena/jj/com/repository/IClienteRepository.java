package sena.jj.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sena.jj.com.model.Cliente;
import java.util.Optional;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
    Optional<Cliente> findByEmail(String email);
}