package logico;

import java.util.ArrayList;

public class OrdenDeCompra {
	
	private ArrayList <Componente> componentes;
	private float costoTotal;
	private Proveedor proveedor;
	
	public OrdenDeCompra(ArrayList<Componente> componentes, float costoTotal, Proveedor proveedor) {
		super();
		this.componentes = componentes;
		this.costoTotal = costoTotal;
		this.proveedor = proveedor;
	}

	public ArrayList<Componente> getComponentes() {
		return componentes;
	}

	public void setComponentes(ArrayList<Componente> componentes) {
		this.componentes = componentes;
	}

	public float getCostoTotal() {
		return costoTotal;
	}

	public void setCostoTotal(float costoTotal) {
		this.costoTotal = costoTotal;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	
	

}
