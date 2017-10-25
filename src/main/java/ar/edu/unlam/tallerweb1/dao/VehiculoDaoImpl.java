package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Vehiculo;

@Service("VehiculoDao")
public class VehiculoDaoImpl implements VehiculoDao{

	@Inject
	private SessionFactory sessionFactory;
	/*Esta clase contiene métodos para leer, guardar o borrar entidades sobre la base de datos.*/
	
	@Override
	public List<Vehiculo> listarVehiculos(Integer cant) {
		final Session session = sessionFactory.getCurrentSession();

		
		List<Vehiculo> vehiculos = session.createCriteria(Vehiculo.class)
								   .add(Restrictions.ge("cantidadDePersonas", cant))
								   .addOrder(Order.asc("cantidadDePersonas")).list();

		return vehiculos;
	}

}
