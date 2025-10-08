package sena.jj.com.repository;

import sena.jj.com.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    
    @Query("SELECT p FROM Pedido p ORDER BY p.fechaHora DESC")
    List<Pedido> findPedidosRecientes();
}