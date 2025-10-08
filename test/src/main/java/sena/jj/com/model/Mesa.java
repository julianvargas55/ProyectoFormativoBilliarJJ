package sena.jj.com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Mesa")
public class Mesa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String numMesa;
	private String estado;
	private String tipoJuego;
	
	@ManyToOne
	private Reservas reservas;
	@OneToMany(mappedBy =  "mesa")
	private List<Servicios>servicios;
	@OneToMany(mappedBy = "mesa")
	private List<Tiempos>tiempos;
	
	
	public Mesa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mesa(Integer id, String numMesa, String estado, String tipoJuego) {
		super();
		this.id = id;
		this.numMesa = numMesa;
		this.estado = estado;
		this.tipoJuego = tipoJuego;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumMesa() {
		return numMesa;
	}
	public void setNumMesa(String numMesa) {
		this.numMesa = numMesa;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTipoJuego() {
		return tipoJuego;
	}
	public void setTipoJuego(String tipoJuego) {
		this.tipoJuego = tipoJuego;
	}
	@Override
	public String toString() {
		return "Mesa [id=" + id + ", numMesa=" + numMesa + ", estado=" + estado + ", tipoJuego=" + tipoJuego + "]";
	}

	
}
