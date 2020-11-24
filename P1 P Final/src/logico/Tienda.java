package logico;

import java.util.ArrayList;

public class Tienda {
	
	
	int x = 0;
	private ArrayList <Componente> componentes;
	private ArrayList <Cliente> clientes;
	private ArrayList <Empleado> empleados;
	private ArrayList <Factura> facturas;
	private ArrayList <OrdenDeCompra> ordenes;
	private ArrayList <Proveedor> proveedores;
	private ArrayList <Combo> combos;
	private static int idComponentes;
	private static int idOrdenes;
	private static int idProveedores;
	private static int idFacturas;
	private static int idCombos;
	private static int idClientes;
	private static int idEmpleados;
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

	public void IngresarComponente(Componente componente) {
		componentes.add(componente);
		idComponentes++;
	}
	
	public void IngresarCliente(Cliente cliente) {
		clientes.add(cliente);
		idClientes++;
	}
	
	public void IngresarEmpleado(Empleado empleado) {
		empleados.add(empleado);
		idEmpleados++;
	}
	
	public void IngresarCombo(Combo combo) {
		combos.add(combo);
		idCombos++;
	}
	
	public void IngresarFactura(Factura factura) {
		facturas.add(factura);
		idFacturas++;
	}
	
	public void IngresarOrdenDeCompra(OrdenDeCompra orden) {
		ordenes.add(orden);
		idOrdenes++;
	}
	
	public void IngresarProveedor(Proveedor proveedor) {
		proveedores.add(proveedor);
		idProveedores++;
	}
	
	
	private void realizarOrden() {
		
		
	}

//Obtener nombre de un empleado
	public String getEmpleado(String cedula) {
		String aux = " ";
		boolean encontrado = false;
		int i = 0;
		
		
		while(!encontrado && i < empleados.size() ) {
			if(empleados.get(i).getCedula().equalsIgnoreCase(cedula)) {
				aux = empleados.get(i).getNombre();
				encontrado = true;
			}
			i++;
		}
		return aux;		
	}
	
//Obtener nombre de un cliente
		public String getCliente(String cedula) {
			String aux = " ";
			boolean encontrado = false;
			int i = 0;
			
			
			while(!encontrado && i < clientes.size() ) {
				if(clientes.get(i).getCedula().equalsIgnoreCase(cedula)) {
					aux = clientes.get(i).getNombre();
					encontrado = true;
				}
				i++;
			}
			return aux;		
		}

	
	

}
