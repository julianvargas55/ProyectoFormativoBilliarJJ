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
@Table(name = "reservas")
public class Reservas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String estado;
	private String horaReserva;

	@ManyToOne
	private Cliente cliente;
	@OneToMany(mappedBy = "reservas")
	private List<Mesa> mesa;

	@ManyToOne
	private Servicios servicios;

	public Reservas() {

	}

	public Reservas(Integer id, String estado, String horaReserva) {
		super();
		this.id = id;
		this.estado = estado;
		this.horaReserva = horaReserva;
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

	public String getHoraReserva() {
		return horaReserva;
	}

	public void setHoraReserva(String horaReserva) {
		this.horaReserva = horaReserva;
	}

	@Override
	public String toString() {
		return "Reservas [id=" + id + ", estado=" + estado + ", horaReserva=" + horaReserva + "]";
	}

}
