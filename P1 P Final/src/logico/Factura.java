package logico;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
	
	private Cliente cliente;
	private Empleado empleado;
	private ArrayList <Componente> componentes;
	private ArrayList <Combo> combos;
	private Date fecha;
	private float precioTotal;
	
	public Factura(Cliente cliente, Empleado empleado, ArrayList<Componente> componentes, ArrayList<Combo> combos,
			Date fecha, float precioTotal) {
		super();
		this.cliente = cliente;
		this.empleado = empleado;
		this.componentes = componentes;
		this.combos = combos;
		this.fecha = fecha;
		this.precioTotal = precioTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public ArrayList<Componente> getComponentes() {
		return componentes;
	}

	public void setComponentes(ArrayList<Componente> componentes) {
		this.componentes = componentes;
	}

	public ArrayList<Combo> getCombos() {
		return combos;
	}

	public void setCombos(ArrayList<Combo> combos) {
		this.combos = combos;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	
	
	

}
