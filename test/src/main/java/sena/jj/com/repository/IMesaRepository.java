package sena.jj.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sena.jj.com.model.Mesa;
import java.util.List;

public interface IMesaRepository extends JpaRepository<Mesa, Integer> {
    List<Mesa> findByEstado(String estado);
}