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
@Table(name = "Cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String ptosAcumulados;
	private String preferencias;

	@OneToMany(mappedBy = "cliente")
	private List<Reservas> reservas;
	@ManyToOne
	private Usuario usuario;

	@OneToMany(mappedBy = "cliente")
	private List<Facturacion> facturacion;
	@OneToMany(mappedBy = "cliente")
	private List<Servicios> servicios;

	@ManyToOne
	private Beneficios beneficios;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(Integer id, String ptosAcumulados, String preferencias) {
		super();
		this.id = id;
		this.ptosAcumulados = ptosAcumulados;
		this.preferencias = preferencias;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPtosAcumulados() {
		return ptosAcumulados;
	}

	public void setPtosAcumulados(String ptosAcumulados) {
		this.ptosAcumulados = ptosAcumulados;
	}

	public String getPreferencias() {
		return preferencias;
	}

	public void setPreferencias(String preferencias) {
		this.preferencias = preferencias;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", ptosAcumulados=" + ptosAcumulados + ", preferencias=" + preferencias + "]";
	}

}
