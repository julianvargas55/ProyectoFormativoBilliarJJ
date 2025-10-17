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
@Table(name = " parqueaderos")
public class Parqueadero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	public String estado;

	@ManyToOne
	private Servicios servicios;

	@OneToMany(mappedBy = "parqueadero")
	private List<Tiempos> tiempos;

	public Parqueadero() {
		
	}

	public Parqueadero(Integer id, String estado) {
		super();
		this.id = id;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Parqueadero [id=" + id + ", estado=" + estado + "]";
	}

}
