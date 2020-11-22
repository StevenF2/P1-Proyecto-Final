package logico;

public abstract class Componente {
	
	protected float precioCompra;
	protected float precioVenta;
	protected int cantDisponible;
	protected int numSerie;
	
	public Componente(float precioCompra, float precioVenta, int cantDisponible, int numSerie) {
		super();
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.cantDisponible = cantDisponible;
		this.numSerie = numSerie;
	}

	public float getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
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
