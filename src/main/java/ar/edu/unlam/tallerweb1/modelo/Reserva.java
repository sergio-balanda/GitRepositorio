package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Reserva {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date fechaDesde;
	private Date fechaHasta;
	private Double precio;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idVehiculo")
    private Vehiculo vehiculo;
}
