package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import logico.Componente;
import logico.DDR1;
import logico.DDR2;
import logico.DDR3;
import logico.DDR4;
import logico.DiscoDuro;
import logico.IDE;
import logico.MemoriaRam;
import logico.Microprocesador;
import logico.Motherboard;
import logico.OrdenDeCompra;
import logico.Proveedor;
import logico.SATA;
import logico.SATA2;
import logico.SATA3;
import logico.SATA4;
import logico.Tienda;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class NuevoProveedor extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtRNC;
	private JTextField txtMBmarca;
	private JTextField txtMBmodelo;
	private JTextField txtMBtiposocket;
	private JTextField txtMmarca;
	private JTextField txtMmodelo;
	private JTextField txtMtiposocket;
	private JTextField txtMvelocidad;
	private JTextField txtMRmarca;
	private JTextField txtMRmemoria;
	private JTextField txtDDmarca;
	private JTextField txtDDmodelo;
	private JTextField txtDDalmacenamiento;
	private JTextField txtCostoTotal;
	private JTextField txtMBcosto;
	private JTextField txtMcosto;
	private JTextField txtMRcosto;
	private JTextField textField_18;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NuevoProveedor dialog = new NuevoProveedor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NuevoProveedor() {
		
		JRadioButton rdbtnMotherBoard = new JRadioButton("Mother Board");
		JRadioButton rdbtnMicroprocesador = new JRadioButton("Microprocesador");
		JRadioButton rdbtnMemoriaRam = new JRadioButton("Memoria Ram");
		JRadioButton rdbtnDiscoDuro = new JRadioButton("Disco Duro");
		JPanel panel_DiscoDuro = new JPanel();
		panel_DiscoDuro.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPanel panel_MemoriaRam = new JPanel();
		panel_MemoriaRam.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPanel panel_MotherBoard = new JPanel();
		JPanel panel_Microprocesador = new JPanel();
		panel_Microprocesador.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JRadioButton rdbtnMBDDR = new JRadioButton("DDR");
		JRadioButton rdbtnMBDDR2 = new JRadioButton("DDR-2");
		JRadioButton rdbtnMBDDR3 = new JRadioButton("DDR-3");
		JRadioButton rdbtnMBDDR4 = new JRadioButton("DDR-4");
		
		ArrayList <OrdenDeCompra> orden = new ArrayList<OrdenDeCompra>();
		ArrayList <Componente> comp = new ArrayList<Componente>();	
		comp.clear();
		
		
		DefaultListModel lista = new DefaultListModel();
		
		
		
		
		setTitle("Nuevo Proveedor");
		setResizable(false);
		setBounds(100, 100, 536, 480);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(10, 11, 64, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("RNC:");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		contentPanel.add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(78, 9, 121, 20);
		contentPanel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtRNC = new JTextField();
		txtRNC.setBounds(78, 34, 121, 20);
		contentPanel.add(txtRNC);
		txtRNC.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 61, 265, 292);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Orden de Compra del Proveedor:");
		lblNewLabel_2.setBounds(10, 11, 232, 14);
		panel.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 52, 245, 229);
		panel.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		list.setModel(lista);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(283, 11, 241, 152);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Agregar Componente:");
		lblNewLabel_3.setBounds(10, 11, 158, 14);
		panel_1.add(lblNewLabel_3);
		
		
		rdbtnMotherBoard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				rdbtnMotherBoard.setSelected(true);
				rdbtnMicroprocesador.setSelected(false);
				rdbtnMemoriaRam.setSelected(false);
				rdbtnDiscoDuro.setSelected(false);
				panel_MotherBoard.setVisible(true);
				panel_Microprocesador.setVisible(false);
				panel_MemoriaRam.setVisible(false);
				panel_DiscoDuro.setVisible(false);
			}
		});
		rdbtnMotherBoard.setSelected(true);
		rdbtnMotherBoard.setBounds(6, 32, 200, 23);
		panel_1.add(rdbtnMotherBoard);
		
		
		rdbtnMicroprocesador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnMotherBoard.setSelected(false);
				rdbtnMicroprocesador.setSelected(true);
				rdbtnMemoriaRam.setSelected(false);
				rdbtnDiscoDuro.setSelected(false);
				panel_MotherBoard.setVisible(false);
				panel_Microprocesador.setVisible(true);
				panel_MemoriaRam.setVisible(false);
				panel_DiscoDuro.setVisible(false);
			}
		});
		rdbtnMicroprocesador.setBounds(6, 58, 162, 23);
		panel_1.add(rdbtnMicroprocesador);
		
		
		rdbtnMemoriaRam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnMotherBoard.setSelected(false);
				rdbtnMicroprocesador.setSelected(false);
				rdbtnMemoriaRam.setSelected(true);
				rdbtnDiscoDuro.setSelected(false);
				panel_MotherBoard.setVisible(false);
				panel_Microprocesador.setVisible(false);
				panel_MemoriaRam.setVisible(true);
				panel_DiscoDuro.setVisible(false);
			}
		});
		rdbtnMemoriaRam.setBounds(6, 84, 162, 23);
		panel_1.add(rdbtnMemoriaRam);
		
		
		rdbtnDiscoDuro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnMotherBoard.setSelected(false);
				rdbtnMicroprocesador.setSelected(false);
				rdbtnMemoriaRam.setSelected(false);
				rdbtnDiscoDuro.setSelected(true);
				panel_MotherBoard.setVisible(false);
				panel_Microprocesador.setVisible(false);
				panel_MemoriaRam.setVisible(false);
				panel_DiscoDuro.setVisible(true);
			}
		});
		rdbtnDiscoDuro.setBounds(6, 110, 109, 23);
		panel_1.add(rdbtnDiscoDuro);
		
		
		panel_DiscoDuro.setVisible(false);
		panel_DiscoDuro.setBounds(285, 174, 239, 229);
		contentPanel.add(panel_DiscoDuro);
		panel_DiscoDuro.setLayout(null);
		
		JLabel lblNewLabel_16 = new JLabel("Marca:");
		lblNewLabel_16.setBounds(10, 11, 126, 14);
		panel_DiscoDuro.add(lblNewLabel_16);
		
		txtDDmarca = new JTextField();
		txtDDmarca.setBounds(141, 9, 86, 20);
		panel_DiscoDuro.add(txtDDmarca);
		txtDDmarca.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Modelo:");
		lblNewLabel_17.setBounds(10, 36, 126, 14);
		panel_DiscoDuro.add(lblNewLabel_17);
		
		txtDDmodelo = new JTextField();
		txtDDmodelo.setBounds(141, 34, 86, 20);
		panel_DiscoDuro.add(txtDDmodelo);
		txtDDmodelo.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Almacenamiento:");
		lblNewLabel_18.setBounds(10, 61, 155, 14);
		panel_DiscoDuro.add(lblNewLabel_18);
		
		txtDDalmacenamiento = new JTextField();
		txtDDalmacenamiento.setBounds(141, 59, 86, 20);
		panel_DiscoDuro.add(txtDDalmacenamiento);
		txtDDalmacenamiento.setColumns(10);
		
		JRadioButton rdbtnDDgb = new JRadioButton("Gb");
		rdbtnDDgb.setBounds(10, 80, 60, 23);
		panel_DiscoDuro.add(rdbtnDDgb);
		
		JRadioButton rdbtnDDtb = new JRadioButton("Tb");
		rdbtnDDtb.setBounds(100, 80, 109, 23);
		panel_DiscoDuro.add(rdbtnDDtb);
		
		JLabel lblNewLabel_19 = new JLabel("Tipo de Conexion:");
		lblNewLabel_19.setBounds(10, 110, 176, 14);
		panel_DiscoDuro.add(lblNewLabel_19);
		
		JRadioButton rdbtnDDide = new JRadioButton("IDE");
		rdbtnDDide.setBounds(10, 125, 70, 23);
		panel_DiscoDuro.add(rdbtnDDide);
		
		JRadioButton rdbtnDDsata = new JRadioButton("SATA");
		rdbtnDDsata.setBounds(100, 125, 109, 23);
		panel_DiscoDuro.add(rdbtnDDsata);
		
		JRadioButton rdbtnDDsata2 = new JRadioButton("SATA-2");
		rdbtnDDsata2.setBounds(10, 145, 86, 23);
		panel_DiscoDuro.add(rdbtnDDsata2);
		
		JRadioButton rdbtnDDsata3 = new JRadioButton("SATA-3");
		rdbtnDDsata3.setBounds(100, 145, 109, 23);
		panel_DiscoDuro.add(rdbtnDDsata3);
		
		JLabel lblNewLabel_24 = new JLabel("Costo:");
		lblNewLabel_24.setBounds(10, 199, 46, 14);
		panel_DiscoDuro.add(lblNewLabel_24);
		
		textField_18 = new JTextField();
		textField_18.setBounds(141, 197, 86, 20);
		panel_DiscoDuro.add(textField_18);
		textField_18.setColumns(10);
		
		
		panel_MemoriaRam.setVisible(false);
		panel_MemoriaRam.setBounds(285, 174, 235, 229);
		contentPanel.add(panel_MemoriaRam);
		panel_MemoriaRam.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("Marca:");
		lblNewLabel_13.setBounds(10, 11, 80, 14);
		panel_MemoriaRam.add(lblNewLabel_13);
		
		txtMRmarca = new JTextField();
		txtMRmarca.setBounds(100, 8, 86, 20);
		panel_MemoriaRam.add(txtMRmarca);
		txtMRmarca.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Memoria:");
		lblNewLabel_14.setBounds(10, 36, 100, 14);
		panel_MemoriaRam.add(lblNewLabel_14);
		
		txtMRmemoria = new JTextField();
		txtMRmemoria.setBounds(100, 33, 86, 20);
		panel_MemoriaRam.add(txtMRmemoria);
		txtMRmemoria.setColumns(10);
		
		JRadioButton rdbtnMRmb = new JRadioButton("Mb");
		rdbtnMRmb.setBounds(10, 61, 70, 23);
		panel_MemoriaRam.add(rdbtnMRmb);
		
		JRadioButton rdbtnMRgb = new JRadioButton("Gb");
		rdbtnMRgb.setBounds(100, 61, 70, 23);
		panel_MemoriaRam.add(rdbtnMRgb);
		
		JLabel lblNewLabel_15 = new JLabel("Tipo:");
		lblNewLabel_15.setBounds(10, 86, 46, 14);
		panel_MemoriaRam.add(lblNewLabel_15);
		
		JRadioButton rdbtnMRddr = new JRadioButton("DDR");
		rdbtnMRddr.setBounds(10, 100, 70, 23);
		panel_MemoriaRam.add(rdbtnMRddr);
		
		JRadioButton rdbtnMRddr2 = new JRadioButton("DDR-2");
		rdbtnMRddr2.setBounds(100, 100, 115, 23);
		panel_MemoriaRam.add(rdbtnMRddr2);
		
		JRadioButton rdbtnMRddr3 = new JRadioButton("DDR-3");
		rdbtnMRddr3.setBounds(10, 123, 70, 23);
		panel_MemoriaRam.add(rdbtnMRddr3);
		
		JRadioButton rdbtnMRddr4 = new JRadioButton("DDR-4");
		rdbtnMRddr4.setBounds(100, 123, 109, 23);
		panel_MemoriaRam.add(rdbtnMRddr4);
		
		JLabel lblNewLabel_23 = new JLabel("Costo:");
		lblNewLabel_23.setBounds(10, 210, 46, 14);
		panel_MemoriaRam.add(lblNewLabel_23);
		
		txtMRcosto = new JTextField();
		txtMRcosto.setBounds(100, 207, 86, 20);
		panel_MemoriaRam.add(txtMRcosto);
		txtMRcosto.setColumns(10);
		
		
		panel_Microprocesador.setVisible(false);
		panel_Microprocesador.setBounds(285, 174, 235, 229);
		contentPanel.add(panel_Microprocesador);
		panel_Microprocesador.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Marca: ");
		lblNewLabel_9.setBounds(10, 11, 57, 14);
		panel_Microprocesador.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Modelo:");
		lblNewLabel_10.setBounds(10, 36, 57, 14);
		panel_Microprocesador.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Tipo de Socket");
		lblNewLabel_11.setBounds(10, 61, 120, 14);
		panel_Microprocesador.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Velocidad:");
		lblNewLabel_12.setBounds(10, 86, 93, 14);
		panel_Microprocesador.add(lblNewLabel_12);
		
		JLabel lblNewLabel_22 = new JLabel("Costo:");
		lblNewLabel_22.setBounds(10, 210, 46, 14);
		panel_Microprocesador.add(lblNewLabel_22);
		
		txtMcosto = new JTextField();
		txtMcosto.setBounds(135, 207, 86, 20);
		panel_Microprocesador.add(txtMcosto);
		txtMcosto.setColumns(10);
		
		txtMmarca = new JTextField();
		txtMmarca.setBounds(135, 8, 86, 20);
		panel_Microprocesador.add(txtMmarca);
		txtMmarca.setColumns(10);
		
		txtMmodelo = new JTextField();
		txtMmodelo.setBounds(135, 30, 86, 20);
		panel_Microprocesador.add(txtMmodelo);
		txtMmodelo.setColumns(10);
		
		txtMtiposocket = new JTextField();
		txtMtiposocket.setBounds(135, 55, 86, 20);
		panel_Microprocesador.add(txtMtiposocket);
		txtMtiposocket.setColumns(10);
		
		txtMvelocidad = new JTextField();
		txtMvelocidad.setBounds(135, 80, 86, 20);
		panel_Microprocesador.add(txtMvelocidad);
		txtMvelocidad.setColumns(10);
		
		JRadioButton rdbtnMmhz = new JRadioButton("MHz");
		rdbtnMmhz.setBounds(10, 111, 80, 23);
		panel_Microprocesador.add(rdbtnMmhz);
		
		JRadioButton rdbtnMghz = new JRadioButton("GHz");
		rdbtnMghz.setBounds(100, 111, 80, 23);
		panel_Microprocesador.add(rdbtnMghz);
		
		
		panel_MotherBoard.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_MotherBoard.setBounds(285, 174, 235, 229);
		contentPanel.add(panel_MotherBoard);
		panel_MotherBoard.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Marca:");
		lblNewLabel_4.setBounds(10, 11, 57, 14);
		panel_MotherBoard.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Modelo:");
		lblNewLabel_5.setBounds(10, 36, 57, 14);
		panel_MotherBoard.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tipo de Socket:");
		lblNewLabel_6.setBounds(10, 61, 110, 14);
		panel_MotherBoard.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Compatible con Ram:");
		lblNewLabel_7.setBounds(10, 86, 160, 14);
		panel_MotherBoard.add(lblNewLabel_7);
		
		JLabel lblNewLabel_21 = new JLabel("Costo:");
		lblNewLabel_21.setBounds(10, 210, 46, 14);
		panel_MotherBoard.add(lblNewLabel_21);
		
		txtMBcosto = new JTextField();
		txtMBcosto.setBounds(135, 207, 86, 20);
		panel_MotherBoard.add(txtMBcosto);
		txtMBcosto.setColumns(10);
		
		txtMBmarca = new JTextField();
		txtMBmarca.setBounds(135, 8, 86, 20);
		panel_MotherBoard.add(txtMBmarca);
		txtMBmarca.setColumns(10);
		
		txtMBmodelo = new JTextField();
		txtMBmodelo.setColumns(10);
		txtMBmodelo.setBounds(135, 30, 86, 20);
		panel_MotherBoard.add(txtMBmodelo);
		
		txtMBtiposocket = new JTextField();
		txtMBtiposocket.setColumns(10);
		txtMBtiposocket.setBounds(135, 55, 86, 20);
		panel_MotherBoard.add(txtMBtiposocket);
		
		
		rdbtnMBDDR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnMBDDR.setSelected(true);
				rdbtnMBDDR2.setSelected(false);
				rdbtnMBDDR3.setSelected(false);
				rdbtnMBDDR4.setSelected(false);
			}
		});
		rdbtnMBDDR.setBounds(10, 100, 60, 23);
		panel_MotherBoard.add(rdbtnMBDDR);
		
		
		rdbtnMBDDR2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnMBDDR.setSelected(false);
				rdbtnMBDDR2.setSelected(true);
				rdbtnMBDDR3.setSelected(false);
				rdbtnMBDDR4.setSelected(false);
			}
		});
		rdbtnMBDDR2.setBounds(77, 100, 62, 23);
		panel_MotherBoard.add(rdbtnMBDDR2);
		
		
		rdbtnMBDDR3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnMBDDR.setSelected(false);
				rdbtnMBDDR2.setSelected(false);
				rdbtnMBDDR3.setSelected(true);
				rdbtnMBDDR4.setSelected(false);
			}
		});
		rdbtnMBDDR3.setBounds(10, 121, 62, 23);
		panel_MotherBoard.add(rdbtnMBDDR3);
		
		
		rdbtnMBDDR4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnMBDDR.setSelected(false);
				rdbtnMBDDR2.setSelected(false);
				rdbtnMBDDR3.setSelected(false);
				rdbtnMBDDR4.setSelected(true);
			}
		});
		rdbtnMBDDR4.setBounds(77, 121, 62, 23);
		panel_MotherBoard.add(rdbtnMBDDR4);
		
		JLabel lblNewLabel_8 = new JLabel("Conexiones de Disco Duro:");
		lblNewLabel_8.setBounds(10, 141, 176, 14);
		panel_MotherBoard.add(lblNewLabel_8);
		
		JRadioButton rdbtnMBIDE = new JRadioButton("IDE");
		rdbtnMBIDE.setBounds(10, 155, 57, 23);
		panel_MotherBoard.add(rdbtnMBIDE);
		
		JRadioButton rdbtnMBSATA = new JRadioButton("SATA");
		rdbtnMBSATA.setBounds(77, 155, 57, 23);
		panel_MotherBoard.add(rdbtnMBSATA);
		
		JRadioButton rdbtnMBSATA2 = new JRadioButton("SATA-2");
		rdbtnMBSATA2.setBounds(10, 174, 67, 23);
		panel_MotherBoard.add(rdbtnMBSATA2);
		
		JRadioButton rdbtnMBSATA3 = new JRadioButton("SATA-3");
		rdbtnMBSATA3.setBounds(77, 174, 74, 23);
		panel_MotherBoard.add(rdbtnMBSATA3);
		
		JLabel lblNewLabel_20 = new JLabel("Costo Total:");
		lblNewLabel_20.setBounds(23, 379, 91, 14);
		contentPanel.add(lblNewLabel_20);
		
		txtCostoTotal = new JTextField();
		txtCostoTotal.setEditable(false);
		txtCostoTotal.setBounds(118, 376, 86, 20);
		contentPanel.add(txtCostoTotal);
		txtCostoTotal.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			JButton btnNewButton = new JButton("Agregar Proveedor");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					ArrayList <OrdenDeCompra> orden = new ArrayList<OrdenDeCompra>();
					Proveedor p = null;
					OrdenDeCompra o = null;
					float costo = 0;
					
					for(Componente c : comp) {
						
						costo += c.getPrecioCompra();
					}
					
					
					o = new OrdenDeCompra(comp, costo);
					orden.add(o);
					String nombre = txtNombre.getText();
					String rnc = txtRNC.getText();
					
					p = new Proveedor(nombre, rnc, orden);
					Tienda.getInstance().IngresarOrdenDeCompra(o);
					Tienda.getInstance().IngresarProveedor(p);
					JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo Proveedor exitosamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
					lista.clear();
					clean();
					
					
				}
			});
			buttonPane.add(btnNewButton);
			{
				JButton okButton = new JButton("Agregar Componente");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						Componente x = null;
						if(rdbtnMotherBoard.isSelected() && !txtMBmarca.getText().isEmpty() && !txtMBmodelo.getText().isEmpty() && !txtMBtiposocket.getText().isEmpty() ) {
							
							float precioCompra = Float.parseFloat(txtMBcosto.getText());
							float precioVenta = precioCompra + 200;
							int cantDisponible = 0;
							int numSerie = Tienda.getInstance().getIdProveedores();//Tienda.getTienda().getIdComponentes();
							String marca = txtMBmarca.getText();
							String modelo = txtMBmodelo.getText();
							String tipoSocket = txtMBtiposocket.getText();
							String tipoRam = null;
							
							if(rdbtnMBDDR.isSelected()) {
								tipoRam = "DDR";
							}
							if(rdbtnMBDDR2.isSelected()) {
								tipoRam = "DDR2";
							}
							if(rdbtnMBDDR3.isSelected()) {
								tipoRam = "DDR3";
							}
							if(rdbtnMBDDR4.isSelected()) {
								tipoRam = "DDR4";
							}
							
							int i = 0;
							String[] conexionesDiscoDuro = new String[5];
						//	String conexion;
							
							if(rdbtnMBIDE.isSelected()) {
								
								conexionesDiscoDuro[i] = "IDE";
								i++;
							}
							if(rdbtnMBSATA.isSelected()) {

								conexionesDiscoDuro[i] = "SATA";
								i++;
							}
							if(rdbtnMBSATA2.isSelected()) {
								
								conexionesDiscoDuro[i] = "SATA2";
								i++;
							}
							if(rdbtnMBSATA3.isSelected()) {
								
								conexionesDiscoDuro[i] = "SATA3";
								i++;
								cantDisponible += 50;
							}
							
						//	float costo = Float.parseFloat(txtMBcosto.getText());
							x = new Motherboard(precioCompra, precioVenta, cantDisponible, numSerie, marca, modelo, tipoSocket, tipoRam, conexionesDiscoDuro);
							comp.add(x);
							
							
						} /*else {
							
							JOptionPane.showMessageDialog(null, "Llenar todos los campos", "Aviso", JOptionPane.INFORMATION_MESSAGE); 
							
						} */
						
						if(rdbtnMicroprocesador.isSelected() && !txtMmarca.getText().isEmpty() && !txtMmodelo.getText().isEmpty() && !txtMtiposocket.getText().isEmpty() && !txtMvelocidad.getText().isEmpty()) {
							
							float precioCompra = Float.parseFloat(txtMBcosto.getText());
							float precioVenta = precioCompra + 400;
							int cantDisponible = 50;
							int numSerie = Tienda.getTienda().getIdComponentes();
							String marca = txtMmarca.getText();
							String modelo = txtMmodelo.getText();
							String tipoSocket = txtMtiposocket.getText();
							float velocidad = Float.parseFloat(txtMvelocidad.getText());
							Boolean MHzGHz = null;
							
							if(rdbtnMmhz.isSelected()) {
								
								MHzGHz = true;
							}
							if(rdbtnMghz.isSelected()) {
								
								MHzGHz = false;
							}
							
							x = new Microprocesador(precioCompra, precioVenta, cantDisponible, numSerie, marca, modelo, tipoSocket, velocidad, MHzGHz);
							comp.add(x);
							
						}/*else {
							
							JOptionPane.showMessageDialog(null, "Llenar todos los campos", "Aviso", JOptionPane.INFORMATION_MESSAGE); 
							
						} */
						
						if(rdbtnMemoriaRam.isSelected() && !txtMRmarca.getText().isEmpty() && !txtMRmemoria.getText().isEmpty()) {
							
							float precioCompra = Float.parseFloat(txtMBcosto.getText());
							float precioVenta = precioCompra + 300;
							int cantDisponible = 50;
							int numSerie = Tienda.getTienda().getIdComponentes();
							String marca = txtMRmarca.getText();
							float cantiMemoria = Float.parseFloat(txtMRmemoria.getText());
							Boolean MbGb = null;
							
							if(rdbtnMRmb.isSelected()) {
								
								MbGb = true;
							}
							if(rdbtnMRgb.isSelected()) {
								
								MbGb = false;
							}
							
							if(rdbtnMRddr.isSelected()) {
								
								x = new DDR1(precioCompra, precioVenta, cantDisponible, numSerie, marca, cantiMemoria, MbGb);
							}
							if(rdbtnMRddr2.isSelected()) {
								
								x = new DDR2(precioCompra, precioVenta, cantDisponible, numSerie, marca, cantiMemoria, MbGb);
							}
							if(rdbtnMRddr3.isSelected()) {
								
								x = new DDR3(precioCompra, precioVenta, cantDisponible, numSerie, marca, cantiMemoria, MbGb);
							}
							if(rdbtnMRddr4.isSelected()) {
								
								x = new DDR4(precioCompra, precioVenta, cantDisponible, numSerie, marca, cantiMemoria, MbGb);
							}
							
							comp.add(x);
							
						}/*lse {
							
							JOptionPane.showMessageDialog(null, "Llenar todos los campos", "Aviso", JOptionPane.INFORMATION_MESSAGE); 
							
						} */
						
						if(rdbtnDiscoDuro.isSelected()) {
							
							float precioCompra = Float.parseFloat(txtMBcosto.getText());
							float precioVenta = precioCompra + 500;
							int cantDisponible = 50;
							int numSerie = Tienda.getTienda().getIdComponentes();
							String marca = txtDDmarca.getText();
							String modelo = txtDDmodelo.getText();
							float almacenamiento = Float.parseFloat(txtDDalmacenamiento.getText());
							Boolean GbTb = null;
							
							if(rdbtnDDgb.isSelected()) {
								
								GbTb = true;
							}
							if(rdbtnDDtb.isSelected()) {
								
								GbTb = false;
							}
							
							if(rdbtnDDide.isSelected()) {
								
								x = new IDE(precioCompra, precioVenta, cantDisponible, numSerie, marca, modelo, almacenamiento, GbTb);
							}
							if(rdbtnDDsata.isSelected()) {
								
								x = new SATA(precioCompra, precioVenta, cantDisponible, numSerie, marca, modelo, almacenamiento, GbTb);
							}
							if(rdbtnDDsata2.isSelected()) {
								
								x = new SATA2(precioCompra, precioVenta, cantDisponible, numSerie, marca, modelo, almacenamiento, GbTb);
							}
							if(rdbtnDDsata3.isSelected()) {
								
								x = new SATA3(precioCompra, precioVenta, cantDisponible, numSerie, marca, modelo, almacenamiento, GbTb);
							}
							
							comp.add(x);
							
						}/*else {
							
							JOptionPane.showMessageDialog(null, "Llenar todos los campos", "Aviso", JOptionPane.INFORMATION_MESSAGE); 
							
						} */
						
					//	System.out.println();
						lista.clear();
						float costoTotal = 0;
						for(Componente c : comp) {
							
							String tipo = "";
							String clase = "";
							costoTotal += c.getPrecioCompra();
							
							if(c instanceof Microprocesador) {
								
								tipo = "Microprocesador";
								clase = "";
							}
							if(c instanceof Motherboard) {
								
								tipo = "MotherBoard";
								clase = "";
								
							}
							if(c instanceof MemoriaRam) {
								
								tipo = "Memoria Ram";
								
								if(c instanceof DDR1) {
									
									clase = "DDR";
								}
								if(c instanceof DDR2) {
									
									clase = "DDR2";
								}
								if(c instanceof DDR3) {
									
									clase = "DDR3";
								}
								if(c instanceof DDR4) {
									
									clase = "DDR4";
								}
								
								}
							if(c instanceof DiscoDuro) {
								
								tipo = "Disco Duro";
								
								if(c instanceof IDE) {
									
									clase = "IDE";
								}
								if(c instanceof SATA2) {
									
									clase = "SATA2";
								}
								if(c instanceof SATA3) {
									
									clase = "SATA3";
								}
								if(c instanceof SATA4) {
									
									clase = "SATA4";
								}
							}
							
							float precio = Math.round((c.getPrecioCompra()*100)/100);
							
							lista.addElement(tipo+"              "+clase+"          "+"50 Unidades"+"         "+precio+"$RD");
							costoTotal += precio;
							txtCostoTotal.setText(""+costoTotal);
													
						}
						
						
					}
				});
				
				
				
				
				
				
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	protected void clean() {
		// TODO Auto-generated method stub
		txtNombre.setText("");
		txtRNC.setText("");
		txtCostoTotal.setText("");
		txtMBcosto.setText("");
		txtMBmarca.setText("");
		txtMBmodelo.setText("");
		txtMBtiposocket.setText("");
		txtMcosto.setText("");
		txtMmarca.setText("");
		txtMmodelo.setText("");
		txtMtiposocket.setText("");
		txtMvelocidad.setText("");
		txtMRcosto.setText("");
		txtMRmarca.setText("");
		txtMRmemoria.setText("");
		txtDDmarca.setText("");
		txtDDmodelo.setText("");
		txtDDalmacenamiento.setText("");
		
		
		
		
	}
}
