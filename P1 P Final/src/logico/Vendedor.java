package logico;

import java.util.ArrayList;

public class Vendedor extends Empleado {
	
	private float comision;
	
	public Vendedor(String nombre, String cedula, float sueldoBase, float numVentas, ArrayList<Factura> facturas,
			String usuario, String contrasena, float comision) {
		super(nombre, cedula, sueldoBase, numVentas, facturas, usuario, contrasena);
		
		this.comision = comision;
		// TODO Auto-generated constructor stub
	}
	
	public float getComision() {
		return comision;
	}
	public void setComision(float comision) {
		this.comision = comision;
	}

	@Override
	public float sueldoTotal() {
		float sueldo = 0;
		
		sueldo = sueldoBase+(comision*numVentas);
		
		return sueldo;
	}

}
