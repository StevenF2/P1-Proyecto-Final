package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.Control;
import logico.Empleado;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(26, 21, 46, 14);
		panel.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		textNombre.setBounds(26, 46, 178, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblCedula = new JLabel("C\u00E9dula");
		lblCedula.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCedula.setBounds(26, 77, 46, 14);
		panel.add(lblCedula);
		
		textCedula = new JTextField();
		textCedula.setFont(new Font("Arial", Font.PLAIN, 12));
		textCedula.setBounds(26, 102, 178, 20);
		panel.add(textCedula);
		textCedula.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		lblUsuario.setBounds(26, 133, 46, 14);
		panel.add(lblUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		textUsuario.setBounds(26, 158, 178, 20);
		panel.add(textUsuario);
		textUsuario.setColumns(10);
		
		lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setFont(new Font("Arial", Font.PLAIN, 12));
		lblContrasena.setBounds(26, 189, 82, 14);
		panel.add(lblContrasena);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(26, 214, 178, 20);
		panel.add(passwordField);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Empleado nuevo = new Empleado(textNombre.getText(), textCedula.getText(), 0, 0, null, textUsuario.getText(), "alberto");
				Control.getInstance().regUser(nuevo);
				Login login = new Login();
				dispose();
				login.setVisible(true);
			}
		});
		btnFinalizar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnFinalizar.setBounds(325, 213, 89, 23);
		panel.add(btnFinalizar);
		
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
