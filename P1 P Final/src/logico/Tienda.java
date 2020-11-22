package logico;

import java.util.ArrayList;

public class Tienda {
	
	private ArrayList <Componente> componentes;
	private ArrayList <Cliente> clientes;
	private ArrayList <Empleado> empleados;
	private ArrayList <Factura> facturas;
	private ArrayList <OrdenDeCompra> ordenes;
	private ArrayList <Proveedor> proveedores;
	private ArrayList <Combo> combos;
	private static int idComponente;
	private static int numOrdenes;
	private static int numProveedores;
	private static int numFacturas;
	private static int numCombos;
	private static int numClientes;
	private static int numEmpleados;
	private static Tienda tienda = null;
	
	private Tienda() {		
		super();
		this.componentes = new ArrayList<Componente>();
		this.clientes = new ArrayList<Cliente>();
		this.empleados = new ArrayList<Empleado>();
		this.facturas = new ArrayList<Factura>();
		this.ordenes = new ArrayList<OrdenDeCompra>();
		this.proveedores = new ArrayList<Proveedor>();
		this.combos = new ArrayList<Combo>();
		
		}
	
	public static Tienda getInstance() {
		if(tienda == null) {
			tienda = new Tienda();
			
		}
		
		return tienda;
	}

	public ArrayList<Componente> getComponentes() {
		return componentes;
	}

	public void setComponentes(ArrayList<Componente> componentes) {
		this.componentes = componentes;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}

	public ArrayList<OrdenDeCompra> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(ArrayList<OrdenDeCompra> ordenes) {
		this.ordenes = ordenes;
	}

	public ArrayList<Proveedor> getProveedores() {
		return proveedores;
	}

	public void setProveedores(ArrayList<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}

	public ArrayList<Combo> getCombos() {
		return combos;
	}

	public void setCombos(ArrayList<Combo> combos) {
		this.combos = combos;
	}

	
	private void realizarOrden() {
		
		
	}
	
	
	
	

}
