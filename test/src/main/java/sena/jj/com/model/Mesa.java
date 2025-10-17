package sena.jj.com.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "mesas")
public class Mesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String numero;
    private Integer capacidad;
    private String estado;

    @OneToMany(mappedBy = "mesa")
    private List<Reservas> reservas;

    public Mesa() {
        this.estado = "DISPONIBLE";
    }

    // Getters y setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public Integer getCapacidad() { return capacidad; }
    public void setCapacidad(Integer capacidad) { this.capacidad = capacidad; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public List<Reservas> getReservas() { return reservas; }
    public void setReservas(List<Reservas> reservas) { this.reservas = reservas; }
}