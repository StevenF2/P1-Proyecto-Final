package logico;

import java.util.ArrayList;

public class Proveedor {
	
	private String nombre;
	private String rnc;
	private ArrayList <OrdenDeCompra> ordenes;
	
	public Proveedor(String nombre, String rnc, ArrayList<OrdenDeCompra> ordenes) {
		super();
		this.nombre = nombre;
		this.rnc = rnc;
		this.ordenes = ordenes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRnc() {
		return rnc;
	}

	public void setRnc(String rnc) {
		this.rnc = rnc;
	}

	public ArrayList<OrdenDeCompra> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(ArrayList<OrdenDeCompra> ordenes) {
		this.ordenes = ordenes;
	}
	
	
	

}
