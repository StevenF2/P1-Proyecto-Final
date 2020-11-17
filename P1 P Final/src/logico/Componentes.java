package logico;

public abstract class Componentes {
	
	protected float precio;
	protected int cantDisponible;
	protected int numSerie;
	protected int x;
	
	public Componentes(float precio, int cantDisponible, int numSerie) {
		super();
		this.precio = precio;
		this.cantDisponible = cantDisponible;
		this.numSerie = numSerie;
	}
	
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getCantDisponible() {
		return cantDisponible;
	}
	public void setCantDisponible(int cantDisponible) {
		this.cantDisponible = cantDisponible;
	}
	public int getNumSerie() {
		return numSerie;
	}
	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}

	
}
