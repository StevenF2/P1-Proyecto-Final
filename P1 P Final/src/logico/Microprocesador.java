package logico;

public class Microprocesador extends Componentes {
	
	protected String marca;
	protected String modelo;
	protected String tipoDeSocket;
	protected int potencia;
	protected boolean tipoPotencia;
	
	public Microprocesador(float precio, int cantDisponible, int numSerie, String marca, String modelo,
			String tipoDeSocket, int potencia, boolean tipoPotencia) {
		super(precio, cantDisponible, numSerie);
		this.marca = marca;
		this.modelo = modelo;
		this.tipoDeSocket = tipoDeSocket;
		this.potencia = potencia;
		this.tipoPotencia = tipoPotencia;
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
	public String getTipoDeSocket() {
		return tipoDeSocket;
	}
	public void setTipoDeSocket(String tipoDeSocket) {
		this.tipoDeSocket = tipoDeSocket;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public boolean isTipoPotencia() {
		return tipoPotencia;
	}
	public void setTipoPotencia(boolean tipoPotencia) {
		this.tipoPotencia = tipoPotencia;
	}

	
}
