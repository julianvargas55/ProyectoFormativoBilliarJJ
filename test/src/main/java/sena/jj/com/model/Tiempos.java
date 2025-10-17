package sena.jj.com.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tiempos")
public class Tiempos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tiempoInc;
    private String tiempoFin;

    @ManyToOne
    @JoinColumn(name = "mesa_id")
    private Mesa mesa;

    @ManyToOne
    @JoinColumn(name = "parqueadero_id")
    private Parqueadero parqueadero;

    @ManyToOne
    @JoinColumn(name = "servicios_id")
    private Servicios servicios;

    public Tiempos() {}

    // Getters y setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getTiempoInc() { return tiempoInc; }
    public void setTiempoInc(String tiempoInc) { this.tiempoInc = tiempoInc; }
    public String getTiempoFin() { return tiempoFin; }
    public void setTiempoFin(String tiempoFin) { this.tiempoFin = tiempoFin; }
    public Mesa getMesa() { return mesa; }
    public void setMesa(Mesa mesa) { this.mesa = mesa; }
    public Parqueadero getParqueadero() { return parqueadero; }
    public void setParqueadero(Parqueadero parqueadero) { this.parqueadero = parqueadero; }
    public Servicios getServicios() { return servicios; }
    public void setServicios(Servicios servicios) { this.servicios = servicios; }
}