package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Vehiculo;

/*
 * lógica de negocio, Se encuentran las funcionalidades de mi 
	aplicacion, se declaran los metodos (@Service).
*/

public interface  ServicioVehiculo {
	public List<Vehiculo> listarVehiculos(Integer cant);
}
