package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Vehiculo;
/*
 * interface
	gestiona los datos almacenados convierte 
	objeto java en bd o recupera
 * */
public interface VehiculoDao {
	List<Vehiculo> listarVehiculos(Integer cant);

}
