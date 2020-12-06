package logico;

import java.io.Serializable;
import java.util.ArrayList;

public class Control implements Serializable{

	private static final long serialVersionUID = 1L;
	private ArrayList<Empleado> misUsusarios;
	private static Control control;
	private static Empleado loginUser;
	
	private Control() {
		misUsusarios = new ArrayList<>();
	}
	
	public static Control getInstance(){
		if(control == null){
			control = new Control();
		}
		return control;
	}

	public ArrayList<Empleado> getMisUsers() {
		return misUsusarios;
	}

	public void setMisUsers(ArrayList<Empleado> misUsers) {
		this.misUsusarios = misUsers;
	}

	public static Control getControl() {
		return control;
	}

	public static void setControl(Control control) {
		Control.control = control;
	}

	public static Empleado getLoginUser() {
		return loginUser;
	}

	public static void setLoginUser(Empleado loginUser) {
		Control.loginUser = loginUser;
	}

	public void regUser(Empleado user) {
		misUsusarios.add(user);
		
	}

	public boolean confirmLogin(String text, String text2) {
		boolean login = false;
		for (Empleado user : misUsusarios) {
			if(user.getUsuario().equals(text) && user.getContrasena().equals(text2)){
				loginUser = user;
				login = true;
			}
		}
		return login;
	}

}
