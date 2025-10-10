package sena.jj.com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tiempos")
public class Tiempos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	public String tiempoInc;
	public String tiempoFin;
	
	@ManyToOne 
	private Mesa mesa;
	@ManyToOne
	private Parqueadero parqueadero;
	@ManyToOne
	private Servicios servicios;
	
	public Tiempos() {
		
	}
	public Tiempos(Integer id, String tiempoInc, String tiempoFin) {
		super();
		this.id = id;
		this.tiempoInc = tiempoInc;
		this.tiempoFin = tiempoFin;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTiempoInc() {
		return tiempoInc;
	}
	public void setTiempoInc(String tiempoInc) {
		this.tiempoInc = tiempoInc;
	}
	public String getTiempoFin() {
		return tiempoFin;
	}
	public void setTiempoFin(String tiempoFin) {
		this.tiempoFin = tiempoFin;
	}
	@Override
	public String toString() {
		return "Tiempos [id=" + id + ", tiempoInc=" + tiempoInc + ", tiempoFin=" + tiempoFin + "]";
	}

	
}
