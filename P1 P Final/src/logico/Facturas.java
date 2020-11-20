package logico;

import java.util.ArrayList;
import java.util.Date;

public class Facturas {
	private Clientes cliente;
	private Empleados empleados;
	private ArrayList <Componentes> componentes;
	private Date fecha;
	private float precio_total;
	public Facturas(Clientes cliente, Empleados empleados, ArrayList<Componentes> componentes, Date fecha,
			float precio_total) {
		super();
		this.cliente = cliente;
		this.empleados = empleados;
		this.componentes = componentes;
		this.fecha = fecha;
		this.precio_total = precio_total;
	}
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	public Empleados getEmpleados() {
		return empleados;
	}
	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}
	public ArrayList<Componentes> getComponentes() {
		return componentes;
	}
	public void setComponentes(ArrayList<Componentes> componentes) {
		this.componentes = componentes;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public float getPrecio_total() {
		return precio_total;
	}
	public void setPrecio_total(float precio_total) {
		this.precio_total = precio_total;
	}
	
	
}


