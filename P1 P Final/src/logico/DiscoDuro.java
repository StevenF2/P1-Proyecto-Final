package logico;

public abstract class DiscoDuro extends Componente {
	
	protected String marca;
	protected String modelo;
	protected float almacenamiento;
	protected Boolean GbTb;
	

	public DiscoDuro(float precioCompra, float precioVenta, int cantDisponible, int numSerie, String marca, String modelo, float almacenamiento, Boolean GbTb) {
		super(precioCompra, precioVenta, cantDisponible, numSerie);
		// TODO Auto-generated constructor stub
		
		this.marca = marca;
		this.modelo = modelo;
		this.almacenamiento = almacenamiento;
		this.GbTb = GbTb;		
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public float getAlmacenamiento() {
		return almacenamiento;
	}


	public void setAlmacenamiento(float almacenamiento) {
		this.almacenamiento = almacenamiento;
	}


	public Boolean getGbTb() {
		return GbTb;
	}


	public void setGbTb(Boolean gbTb) {
		GbTb = gbTb;
	}
	
	
	

}
