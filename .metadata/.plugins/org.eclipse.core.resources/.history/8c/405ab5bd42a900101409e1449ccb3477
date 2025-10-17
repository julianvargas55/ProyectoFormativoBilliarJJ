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
@Table(name = "servicios")
public class Servicios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombServicio;
	private String descripcion;
	private String precio;
	private String estado;

	@OneToMany(mappedBy = "servicios")
	private List<Parqueadero> parqueadero;

	@OneToMany(mappedBy = "servicios")
	private List<Producto> producto;

	@OneToMany(mappedBy = "servicios")
	private List<Reservas> reservas;

	@ManyToOne
	private Mesa mesa;
	@ManyToOne
	private Facturacion facturacion;
	@ManyToOne
	private Cliente cliente;
	@OneToMany(mappedBy = "servicios")
	private List<Tiempos> tiempos;

	public Servicios() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Servicios(Integer id, String nombServicio, String descripcion, String precio, String estado) {
		super();
		this.id = id;
		this.nombServicio = nombServicio;
		this.descripcion = descripcion;
		this.precio = precio;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombServicio() {
		return nombServicio;
	}

	public void setNombServicio(String nombServicio) {
		this.nombServicio = nombServicio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Servicios [id=" + id + ", nombServicio=" + nombServicio + ", descripcion=" + descripcion + ", precio="
				+ precio + ", estado=" + estado + "]";
	}

}
