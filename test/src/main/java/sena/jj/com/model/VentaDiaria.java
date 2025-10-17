package sena.jj.com.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ventas_diarias")
public class VentaDiaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate fecha;
    private Integer totalPedidos;
    private Double totalVentas;
    private Double promedioPedido;

    public VentaDiaria() {}

    // Getters y setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public Integer getTotalPedidos() { return totalPedidos; }
    public void setTotalPedidos(Integer totalPedidos) { this.totalPedidos = totalPedidos; }
    public Double getTotalVentas() { return totalVentas; }
    public void setTotalVentas(Double totalVentas) { this.totalVentas = totalVentas; }
    public Double getPromedioPedido() { return promedioPedido; }
    public void setPromedioPedido(Double promedioPedido) { this.promedioPedido = promedioPedido; }
}