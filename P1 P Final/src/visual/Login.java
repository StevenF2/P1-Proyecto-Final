package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.Control;
import logico.Usuarios;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textCedula;
	private JTextField textUsuario2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				FileInputStream empresa;
				FileOutputStream empresa2;
				ObjectInputStream empresaRead;
				ObjectOutputStream empresaWrite;
				try {
					empresa = new FileInputStream ("empresa.dat");
					empresaRead = new ObjectInputStream(empresa);
					Control temp = (Control)empresaRead.readObject();
					Control.setControl(temp);
					empresa.close();
					empresaRead.close();
				} catch (FileNotFoundException e) {
					try {
						empresa2 = new  FileOutputStream("empresa.dat");
						empresaWrite = new ObjectOutputStream(empresa2);
						Usuarios aux = new Usuarios("Admin", "Admin");
						Control.getInstance().regUser(aux);
						empresaWrite.writeObject(Control.getInstance());
						empresa2.close();
						empresaWrite.close();
					} catch (FileNotFoundException e1) {
					} catch (IOException e1) {
						// TODO Auto-generated catch block
					}
				} catch (IOException e) {
					
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnRegistro = new JButton("Registrarse");
		btnRegistro.setFont(new Font("Arial", Font.PLAIN, 12));
		btnRegistro.setBounds(180, 217, 112, 23);
		panel.add(btnRegistro);
		
		JButton btnInicio = new JButton("Iniciar sesion");
		btnInicio.setFont(new Font("Arial", Font.PLAIN, 12));
		btnInicio.setBounds(302, 217, 112, 23);
		panel.add(btnInicio);
		
		textNombre = new JTextField();
		textNombre.setBounds(44, 148, 248, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		textNombre.setVisible(false);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(44, 123, 86, 14);
		panel.add(lblNombre);
		lblNombre.setVisible(false);
		
		JLabel lblCedula = new JLabel("C\u00E9dula");
		lblCedula.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedula.setBounds(44, 179, 86, 14);
		panel.add(lblCedula);
		lblCedula.setVisible(false);
		
		textCedula = new JTextField();
		textCedula.setBounds(44, 204, 248, 20);
		panel.add(textCedula);
		textCedula.setColumns(10);
		textCedula.setVisible(false);
		
		JLabel lblUsuario2 = new JLabel("Usuario");
		lblUsuario2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblUsuario2.setBounds(44, 11, 86, 14);
		panel.add(lblUsuario2);
		lblUsuario2.setVisible(false);
		
		textUsuario2 = new JTextField();
		textUsuario2.setBounds(44, 36, 248, 20);
		panel.add(textUsuario2);
		textUsuario2.setColumns(10);
		textUsuario2.setVisible(false);
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a\r\n");
		lblContraseña.setFont(new Font("Arial", Font.PLAIN, 12));
		lblContraseña.setBounds(44, 67, 86, 14);
		panel.add(lblContraseña);
		lblContraseña.setVisible(false);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnFinalizar.setBounds(325, 217, 89, 23);
		panel.add(btnFinalizar);
		btnFinalizar.setVisible(false);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 12));
		passwordField.setBounds(44, 92, 248, 20);
		panel.add(passwordField);
		passwordField.setVisible(false);
		
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnInicio.setVisible(false);
				btnRegistro.setVisible(false);
				textNombre.setVisible(true);
				lblNombre.setVisible(true);
				lblCedula.setVisible(true);
				textCedula.setVisible(true);
				lblUsuario2.setVisible(true);
				textUsuario2.setVisible(true);
				lblContraseña.setVisible(true);
				passwordField.setVisible(true);
				btnFinalizar.setVisible(true);
				
			}
		});
		
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnInicio.setVisible(false);
				btnRegistro.setVisible(false);
				lblUsuario2.setVisible(true);
				textUsuario2.setVisible(true);
				lblContraseña.setVisible(true);
				passwordField.setVisible(true);
				btnFinalizar.setVisible(true);
			}
		});
	}
}
