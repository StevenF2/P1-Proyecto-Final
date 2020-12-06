package logico;

import java.io.Serializable;

public class Usuarios implements Serializable{
    
	private static final long serialVersionUID = 1L;
	private String userName;
	private String contra;
	
	
	public Usuarios(String userName, String contra) {
		super();
		this.userName = userName;
		this.setContra(contra);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}
}
