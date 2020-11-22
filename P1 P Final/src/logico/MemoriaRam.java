package logico;

public abstract class MemoriaRam extends Componente {
	
	protected String marca;
	protected int cantiMemoria;
	protected boolean MbGb;
		

	public MemoriaRam(float precioCompra, float precioVenta, int cantDisponible, int numSerie, String marca, int cantiMemoria, boolean MbGb) {
		super(precioCompra, precioVenta, cantDisponible, numSerie);
		// TODO Auto-generated constructor stub
		
		this.marca = marca;
		this.cantiMemoria = cantiMemoria;
		this.MbGb = MbGb;
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCantiMemoria() {
		return cantiMemoria;
	}
	public void setCantiMemoria(int cantiMemoria) {
		this.cantiMemoria = cantiMemoria;
	}
	public boolean isMbGb() {
		return MbGb;
	}
	public void setMbGb(boolean mbGb) {
		MbGb = mbGb;
	}
	
	

}
