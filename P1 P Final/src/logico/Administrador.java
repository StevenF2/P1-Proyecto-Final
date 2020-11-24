package logico;

import java.util.ArrayList;

public class Administrador extends Empleado {

	public Administrador(String nombre, String cedula, float sueldoBase, float numVentas, ArrayList<Factura> facturas,
			String usuario, String contrasena) {
		super(nombre, cedula, sueldoBase, numVentas, facturas, usuario, contrasena);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float sueldoTotal() {
		// TODO Auto-generated method stub
		return sueldoBase;
	}
	

}
