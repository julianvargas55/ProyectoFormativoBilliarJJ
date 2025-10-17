package sena.jj.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sena.jj.com.model.Pedido;
import java.util.List;

public interface IPedidoRepository extends JpaRepository<Pedido, Integer> {
    List<Pedido> findAllByOrderByFechaCreacionDesc();
    List<Pedido> findByEstado(String estado);
    List<Pedido> findByUsuarioId(Integer usuarioId);
    
    @Query("SELECT p FROM Pedido p WHERE p.usuario.id = ?1 ORDER BY p.fechaCreacion DESC")
    List<Pedido> findByUsuarioIdOrderByFechaCreacionDesc(Integer usuarioId);
    
    Long countByEstado(String estado);
    
    @Query("SELECT p FROM Pedido p WHERE p.fechaCreacion >= CURRENT_DATE")
    List<Pedido> findPedidosHoy();
}