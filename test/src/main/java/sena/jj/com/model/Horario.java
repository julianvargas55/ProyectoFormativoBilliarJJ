package sena.jj.com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = " Horarios")
public class Horario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String horaInc;
	private String horaFin;
	private String horaEstablecida;
	private String horaExtra;

	@OneToMany(mappedBy = "horario")
	private List<Trabajador> trabajador;

	public Horario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Horario(Integer id, String horaInc, String horaFin, String horaEstablecida, String horaExtra) {
		super();
		this.id = id;
		this.horaInc = horaInc;
		this.horaFin = horaFin;
		this.horaEstablecida = horaEstablecida;
		this.horaExtra = horaExtra;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHoraInc() {
		return horaInc;
	}

	public void setHoraInc(String horaInc) {
		this.horaInc = horaInc;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public String getHoraEstablecida() {
		return horaEstablecida;
	}

	public void setHoraEstablecida(String horaEstablecida) {
		this.horaEstablecida = horaEstablecida;
	}

	public String getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(String horaExtra) {
		this.horaExtra = horaExtra;
	}

	@Override
	public String toString() {
		return "Horario [id=" + id + ", horaInc=" + horaInc + ", horaFin=" + horaFin + ", horaEstablecida="
				+ horaEstablecida + ", horaExtra=" + horaExtra + "]";
	}

}
