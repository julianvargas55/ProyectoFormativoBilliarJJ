package sena.jj.com.model;

import jakarta.persistence.*;

@Entity
@Table(name = "parqueaderos")
public class Parqueadero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String estado;

    @ManyToOne
    @JoinColumn(name = "servicios_id")
    private Servicios servicios;

    public Parqueadero() {}

    // Getters y setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public Servicios getServicios() { return servicios; }
    public void setServicios(Servicios servicios) { this.servicios = servicios; }
}