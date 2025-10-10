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
@Table(name = "trabajadores")
public class Trabajador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cargo;
	private String salario;
	private String horasExtras;

	@ManyToOne
	private Horario horario;

	@OneToMany(mappedBy = "trabajador")
	private List<Producto> producto;

	@OneToMany(mappedBy = "trabajador")
	private List<Facturacion> facturacion;

	public Trabajador() {

	}

	public Trabajador(Integer id, String cargo, String salario, String horasExtras) {
		super();
		this.id = id;
		this.cargo = cargo;
		this.salario = salario;
		this.horasExtras = horasExtras;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(String horasExtras) {
		this.horasExtras = horasExtras;
	}

	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", cargo=" + cargo + ", salario=" + salario + ", horasExtras=" + horasExtras
				+ "]";
	}

}