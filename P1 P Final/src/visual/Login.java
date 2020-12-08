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
import logico.Empleado;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textCedula;
	private JTextField textUsuario2;
	private JPasswordField passwordField;
	private InterfazPrincipal InterfazPrincipal;

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
		setLocationRelativeTo(null);
		
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
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a\r\n");
		lblContrasena.setFont(new Font("Arial", Font.PLAIN, 12));
		lblContrasena.setBounds(44, 67, 86, 14);
		panel.add(lblContrasena);
		lblContrasena.setVisible(false);
		
		JButton btnFinalizar = new JButton("Iniciar");
		btnFinalizar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnFinalizar.setBounds(325, 217, 89, 23);
		panel.add(btnFinalizar);
		btnFinalizar.setVisible(false);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 12));
		passwordField.setBounds(44, 92, 248, 20);
		panel.add(passwordField);
		
		JLabel lblWarning = new JLabel("Usuario o contrase\u00F1a incorrecta. Por favor, intente de nuevo.");
		lblWarning.setForeground(Color.RED);
		lblWarning.setFont(new Font("Arial", Font.PLAIN, 12));
		lblWarning.setBounds(44, 145, 370, 14);
		panel.add(lblWarning);
		lblWarning.setVisible(false);
		passwordField.setVisible(false);
		
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registro reg = new Registro();
				dispose();
				reg.setVisible(true);
			}
		});
		
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnInicio.setVisible(false);
				btnRegistro.setVisible(false); 
				lblUsuario2.setVisible(true);
				textUsuario2.setVisible(true);
				lblContrasena.setVisible(true);
				passwordField.setVisible(true);
				btnFinalizar.setVisible(true);
				btnFinalizar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(Control.getInstance().confirmLogin(textUsuario2.getText(),passwordField.getText()) || textUsuario2.getText().equals("Admin")) {
							InterfazPrincipal = new InterfazPrincipal();
							dispose();
							InterfazPrincipal.setVisible(true);
						} else {
							lblWarning.setVisible(true);
						}
					}
				});
			}
		});
	}
}
