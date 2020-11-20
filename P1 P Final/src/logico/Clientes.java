package logico;

import java.util.ArrayList;

public class Clientes {
	private String name;
	private String address;
	private int phone;
	private String cedula;
	private ArrayList <Facturas> facturas;
	
	public Clientes(String name, String address, int phone, String cedula, ArrayList<Facturas> facturas) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.cedula = cedula;
		this.facturas = facturas;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Facturas> getFacturas() {
		return facturas;
	}

	public void setFacturas(ArrayList<Facturas> facturas) {
		this.facturas = facturas;
	}
	
	
}
