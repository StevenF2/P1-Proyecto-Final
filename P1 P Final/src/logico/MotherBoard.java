package logico;

import java.util.ArrayList;

public class MotherBoard extends Componentes {
	
	protected String marca;
	protected String modelo;
	protected String tipoSocket;
	protected String tipoRam;
	protected ArrayList<String>conexionesDiscoDuro;
	
	public MotherBoard(float precio, int cantDisponible, int numSerie, String marca, String modelo, String tipoSocket,
			String tipoRam, ArrayList<String> conexionesDiscoDuro) {
		super(precio, cantDisponible, numSerie);
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

	public ArrayList<String> getConexionesDiscoDuro() {
		return conexionesDiscoDuro;
	}

	public void setConexionesDiscoDuro(ArrayList<String> conexionesDiscoDuro) {
		this.conexionesDiscoDuro = conexionesDiscoDuro;
	}

	

}
