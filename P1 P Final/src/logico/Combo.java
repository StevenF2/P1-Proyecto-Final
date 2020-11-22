package logico;

import java.util.ArrayList;

public class Combo {
	
	private int numCombo;
	private ArrayList <Componente> componentes;
	private float precioTotal;
	
	public Combo(int numCombo, ArrayList<Componente> componentes, float precioTotal) {
		super();
		this.numCombo = numCombo;
		this.componentes = componentes;
		this.precioTotal = precioTotal;
	}

	public int getNumCombo() {
		return numCombo;
	}

	public void setNumCombo(int numCombo) {
		this.numCombo = numCombo;
	}

	public ArrayList<Componente> getComponentes() {
		return componentes;
	}

	public void setComponentes(ArrayList<Componente> componentes) {
		this.componentes = componentes;
	}

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	

}
 