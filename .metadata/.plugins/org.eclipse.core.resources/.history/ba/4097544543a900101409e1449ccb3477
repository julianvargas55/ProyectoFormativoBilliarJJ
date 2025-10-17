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
@Table(name = "facturaciones")
public class Facturacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String TipoFacturacion;

	@ManyToOne
	private Cliente cliente;

	@OneToMany(mappedBy = "facturacion")
	private List<Servicios> servicios;

	@ManyToOne
	private Trabajador trabajador;

	public Facturacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facturacion(Integer id, String tipoFacturacion) {
		super();
		this.id = id;
		TipoFacturacion = tipoFacturacion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoFacturacion() {
		return TipoFacturacion;
	}

	public void setTipoFacturacion(String tipoFacturacion) {
		TipoFacturacion = tipoFacturacion;
	}

	@Override
	public String toString() {
		return "Facturacion [id=" + id + ", TipoFacturacion=" + TipoFacturacion + "]";
	}

}
