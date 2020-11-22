package logico;

import java.util.ArrayList;

public class OrdenDeCompra {
	
	private ArrayList <Componente> componentes;
	private float costoTotal;
	
	public OrdenDeCompra(ArrayList<Componente> componentes, float costoTotal) {
		super();
		this.componentes = componentes;
		this.costoTotal = costoTotal;
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
	
	
	

}
