package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.Administrador;
import logico.Control;
import logico.Empleado;
import logico.Factura;
import logico.Vendedor;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textCedula;
	private JTextField textUsuario;
	private JLabel lblContrasena;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(26, 11, 46, 14);
		panel.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		textNombre.setBounds(26, 36, 178, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblCedula = new JLabel("C\u00E9dula");
		lblCedula.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedula.setBounds(26, 67, 46, 14);
		panel.add(lblCedula);
		
		textCedula = new JTextField();
		textCedula.setFont(new Font("Arial", Font.PLAIN, 12));
		textCedula.setBounds(26, 92, 178, 20);
		panel.add(textCedula);
		textCedula.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		lblUsuario.setBounds(26, 123, 46, 14);
		panel.add(lblUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		textUsuario.setBounds(26, 148, 178, 20);
		panel.add(textUsuario);
		textUsuario.setColumns(10);
		
		lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setFont(new Font("Arial", Font.PLAIN, 12));
		lblContrasena.setBounds(26, 179, 82, 14);
		panel.add(lblContrasena);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(26, 204, 178, 20);
		panel.add(passwordField);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnFinalizar.setBounds(325, 213, 89, 23);
		panel.add(btnFinalizar);
		
		JRadioButton rdbtnVendedor = new JRadioButton("Vendedor");
		rdbtnVendedor.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnVendedor.setBounds(226, 46, 109, 23);
		panel.add(rdbtnVendedor);
		
		JRadioButton rdbtnAdministrador = new JRadioButton("Administrador\r\n");
		rdbtnAdministrador.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnAdministrador.setBounds(226, 77, 109, 23);
		panel.add(rdbtnAdministrador);
		
		rdbtnVendedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnAdministrador.setSelected(false);
			}
		});
		
		rdbtnAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnVendedor.setSelected(false);
			}
		});
		
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(rdbtnAdministrador.getIcon() != null) {
					Administrador nuevo = new Administrador(textNombre.getText(), textCedula.getText(), 0, 0, null, textUsuario.getText(), passwordField.getText());
					Control.getInstance().regUser(nuevo);
				} else {
					Vendedor nuevo = new Vendedor(textNombre.getText(), textCedula.getText(), 0, 0, null, textUsuario.getText(), passwordField.getText(), 0);
					Control.getInstance().regUser(nuevo);
				}
				Login login = new Login();
				dispose();
				login.setVisible(true);
			}
		});
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				dispose();
				login.setVisible(true);
			}
		});
		btnCancelar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCancelar.setBounds(226, 213, 89, 23);
		panel.add(btnCancelar);		
		
	}
}
