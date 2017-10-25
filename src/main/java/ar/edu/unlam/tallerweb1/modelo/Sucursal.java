package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Sucursal {
	
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idReserva")
    private Reserva reserva;
}
