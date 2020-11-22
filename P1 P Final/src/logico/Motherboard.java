package logico;

public class Motherboard extends Componente {
	
	private String marca;
	private String modelo;
	private String tipoSocket;
	private String tipoRam;
	private String[] conexionesDiscoDuro;
	

	public Motherboard(float precioCompra, float precioVenta, int cantDisponible, int numSerie, String marca, String modelo, String tipoSocket, String tipoRam, String[] conexionesDiscoDuro) {
		super(precioCompra, precioVenta, cantDisponible, numSerie);
		// TODO Auto-generated constructor stub
		
		this.marca = marca;
		this.modelo = modelo;
		this.tipoSocket = tipoSocket;
		this.tipoRam = tipoRam;
		this.conexionesDiscoDuro = conexionesDiscoDuro;
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


	public String getTipoRam() {
		return tipoRam;
	}


	public void setTipoRam(String tipoRam) {
		this.tipoRam = tipoRam;
	}


	public String[] getConexionesDiscoDuro() {
		return conexionesDiscoDuro;
	}


	public void setConexionesDiscoDuro(String[] conexionesDiscoDuro) {
		this.conexionesDiscoDuro = conexionesDiscoDuro;
	}

	
	
}
