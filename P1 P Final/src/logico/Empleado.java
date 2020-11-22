package logico;

import java.util.ArrayList;

public abstract class Empleado {
	protected String nombre;
	protected String cedula;
	protected float sueldoBase;
	protected float numVentas;
	protected ArrayList <Factura> facturas;
	protected String usuario;
	protected String contrasena;
	
	public Empleado(String nombre, String cedula, float sueldoBase, float numVentas, ArrayList<Factura> facturas,
			String usuario, String contrasena) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.sueldoBase = sueldoBase;
		this.numVentas = numVentas;
		this.facturas = new ArrayList<Factura>();
		this.usuario = usuario;
		this.contrasena = contrasena;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public float getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public float getNumVentas() {
		return numVentas;
	}
	public void setNumVentas(float numVentas) {
		this.numVentas = numVentas;
	}
	public ArrayList<Factura> getFacturas() {
		return facturas;
	}
	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
	abstract public float sueldoTotal();
	
}


