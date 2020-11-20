package logico;

import java.util.ArrayList;

public class Empleados {
	protected String nombre;
	protected String cedula;
	protected float sueldoBase;
	protected int numVentas;
	protected ArrayList <Facturas> facturas;
	protected String usuario;
	protected String contrasena;
	public Empleados(String nombre, String cedula, float sueldoBase, int numVentas, ArrayList<Facturas> facturas,
			String usuario, String contrasena) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.sueldoBase = sueldoBase;
		this.numVentas = numVentas;
		this.facturas = facturas;
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
	public int getNumVentas() {
		return numVentas;
	}
	public void setNumVentas(int numVentas) {
		this.numVentas = numVentas;
	}
	public ArrayList<Facturas> getFacturas() {
		return facturas;
	}
	public void setFacturas(ArrayList<Facturas> facturas) {
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
}


