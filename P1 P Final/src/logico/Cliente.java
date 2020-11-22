package logico;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String direccion;
	private String telefono;
	private String cedula;
	private ArrayList <Factura> facturas;
	
	public Cliente(String name, String address, String telefono, String cedula, ArrayList<Factura> facturas) {
		super();
		this.nombre = name;
		this.direccion = address;
		this.telefono = telefono;
		this.cedula = cedula;
		this.facturas = new ArrayList<Factura>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}

	
	
}
