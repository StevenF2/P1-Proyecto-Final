package logico;

public class Microprocesador extends Componente {
	
	private String marca;
	private String modelo;
	private String tipoSocket;
	private float velocidad;
	private Boolean MHzGHz;
	

	public Microprocesador(float precioCompra, float precioVenta, int cantDisponible, int numSerie, String marca, String modelo, String tipoSocket, float velocidad, Boolean MHzGHz) {
		super(precioCompra, precioVenta, cantDisponible, numSerie);		
		
		this.marca = marca;
		this.modelo = modelo;
		this.tipoSocket = tipoSocket;
		this.velocidad = velocidad;
		this.MHzGHz = MHzGHz;
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


	public String getTipoSocket() {
		return tipoSocket;
	}


	public void setTipoSocket(String tipoSocket) {
		this.tipoSocket = tipoSocket;
	}


	public float getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}


	public Boolean getMHzGHz() {
		return MHzGHz;
	}


	public void setMHzGHz(Boolean mHzGHz) {
		MHzGHz = mHzGHz;
	}
	
	

}
