package ar.edu.unlam.tallerweb1.controladores;



import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.servicios.ServicioVehiculo;

@Controller
public class ControladorPrueba {
	@Inject
	private ServicioVehiculo servicioVehiculo;
	/*servico mediador entre dao y controlador*/
	
	
	@RequestMapping ("/vehiculos")
	public ModelAndView verVehiculos (@RequestParam ("cantidad") Integer cant){

		ModelMap modelo = new ModelMap();
		
		modelo.put("vehiculos", servicioVehiculo.listarVehiculos(cant));
		return new ModelAndView ("vehiculos", modelo);
	}
	
	@RequestMapping(path="/")
	public ModelAndView irAPrueba()
	{
		return new ModelAndView("index");
	}
	@RequestMapping("/pasajeros")
	public ModelAndView irAPasajero ()
	{
		return new ModelAndView("pasajeros");
	}
	/*@RequestMapping("/reservar")
	public ModelAndView buscaCantidad (@RequestParam ("cantidad") Integer cantidad)
	{
		ModelMap modelo = new ModelMap();
		modelo.put("valor",cantidad);
		return new ModelAndView("pruebaok",modelo);
		
	}*/

}
