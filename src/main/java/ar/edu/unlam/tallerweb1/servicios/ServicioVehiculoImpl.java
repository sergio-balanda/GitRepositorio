package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.VehiculoDao;
import ar.edu.unlam.tallerweb1.modelo.Vehiculo;


// annotations @Service para decirle a Spring que es un bean que tiene que manejar,
@Service("servicioVehiculo")

//marcar los métodos transaccionales.
@Transactional

public class ServicioVehiculoImpl implements ServicioVehiculo{
	//injecta un bean, “inyectarle” (pasarle)
	@Inject
	private VehiculoDao vehiculoDao;
	@Override
	public List<Vehiculo> listarVehiculos(Integer cant) {
		// TODO Auto-generated method stub
		return vehiculoDao.listarVehiculos(cant);
	}

}
