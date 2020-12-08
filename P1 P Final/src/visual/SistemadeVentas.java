package visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

import logico.Factura;
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
import logico.SATA;
import logico.SATA2;
import logico.SATA3;
import logico.SATA4;
import logico.Tienda;


import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class SistemadeVentas extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Dimension dim;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private JTextField textField_1;
	private JTextField txtVariables;
	private JTable table_2;
	private JTable table_carrocompras;
	private JTextField CostoTotal;

	/**
	 * Launch the application.
	 */
	
	String Producto = "";
	String CompMBconRAM = "";
	String ConMBconDD = "";
	boolean MPvelocidad = false;
	String MRAMAlma = "";
	String TipoRAM = "";
	boolean DDAlma = false;
	String ConexionDD = "";
	boolean bol = false;
	String ped2 = "";
	String ped3 = "";
	String Component = "";
	

	public static void main(String[] args) {
		try{
		    UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		} catch(Exception e){
		    System.out.println(e);
		}
		try {
			SistemadeVentas dialog = new SistemadeVentas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SistemadeVentas() {
		setBounds(100, 100, 580, 320);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		dim = getToolkit().getScreenSize();
		contentPanel.setLayout(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JLabel lblNombreDelCliente = new JLabel("Nombre del Cliente: ");
			lblNombreDelCliente.setSize(152, 20);
			lblNombreDelCliente.setLocation(12, 12);
			contentPanel.add(lblNombreDelCliente);
		}
		
		textField = new JTextField();
		textField.setBounds(165, 13, 161, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		setTitle("Realizar Venta");
		setResizable(false);

		
		JPanel panel_productoaelegir = new JPanel();
		JPanel panel_DiscoDuro = new JPanel();
		JPanel panel_ConexionDiscoDuro = new JPanel();
		JPanel panel_MotherBoard = new JPanel();
	 	JPanel panel_Microprocesador = new JPanel();
		JPanel panel_MemoriaRam = new JPanel();
		JPanel panel_CarritoCompras = new JPanel();
		JPanel panel_ProductSelected = new JPanel();
		
		//Para evitar overlap en el panel anterior al que corresponden
		//Botones del almacenamiento de disco duro
	
		JRadioButton rdbtnGbDD = new JRadioButton("GB");
		rdbtnGbDD.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnGbDD.setVisible(false);
		rdbtnGbDD.setActionCommand( 
				rdbtnGbDD.getText() );
		JRadioButton rdbtnTbDD = new JRadioButton("TB");
		rdbtnTbDD.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnTbDD.setVisible(false);
		rdbtnTbDD.setActionCommand( 
				rdbtnTbDD.getText() );
		
		//Para evitar overlap en el panel anterior al que corresponden
		//Botones de la conexion de disco duro
		JRadioButton rdbtnIDEDD = new JRadioButton("IDE");
		rdbtnIDEDD.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnIDEDD.setActionCommand( 
				rdbtnIDEDD.getText() );
		JRadioButton rdbtnSataDD = new JRadioButton("SATA");
		rdbtnSataDD.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnSataDD.setActionCommand( 
				rdbtnSataDD.getText() );
		JRadioButton rdbtnSata2DD = new JRadioButton("SATA-2");
		rdbtnSata2DD.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnSata2DD.setActionCommand( 
				rdbtnSata2DD.getText() );
		JRadioButton rdbtnSata3DD = new JRadioButton("SATA-3");
		rdbtnSata3DD.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnSata2DD.setActionCommand( 
				rdbtnSata2DD.getText() );
		
		rdbtnSataDD.setVisible(false);
		rdbtnIDEDD.setVisible(false);
		rdbtnSata2DD.setVisible(false);
		rdbtnSata3DD.setVisible(false);
		
		//Para evitar overlap en el panel anterior al que corresponden
		//Botones los detalles de la memoria RAM
		JRadioButton rdbtnGbMR = new JRadioButton("GB");
		rdbtnGbMR.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnGbMR.setActionCommand( 
				rdbtnGbMR.getText() );
		JRadioButton rdbtnMbMR = new JRadioButton("MB");
		rdbtnMbMR.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnMbMR.setActionCommand( 
				rdbtnMbMR.getText() );
		JRadioButton rdbtnDdrMR = new JRadioButton("DDR");
		rdbtnDdrMR.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnDdrMR.setActionCommand( 
				rdbtnDdrMR.getText() );
		JRadioButton rdbtnDdr_1MR = new JRadioButton("DDR-2");
		rdbtnDdr_1MR.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnDdr_1MR.setActionCommand( 
				rdbtnDdr_1MR.getText() );
		JRadioButton rdbtnDdr_2MR = new JRadioButton("DDR-3");
		rdbtnDdr_2MR.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnDdr_2MR.setActionCommand( 
				rdbtnDdr_2MR.getText() );
		JRadioButton rdbtnDdr_3MR = new JRadioButton("DDR-4");
		rdbtnDdr_3MR.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnDdr_3MR.setActionCommand( 
				rdbtnDdr_3MR.getText() );
		
		JToggleButton tglbtnAtrsMR = new JToggleButton("Atrás");
		JToggleButton tglbtnSiguiente3 = new JToggleButton("Siguiente");
		
		rdbtnGbMR.setVisible(false);
		rdbtnMbMR.setVisible(false);
		rdbtnDdrMR.setVisible(false);
		rdbtnDdr_1MR.setVisible(false);
		rdbtnDdr_2MR.setVisible(false);
		rdbtnDdr_3MR.setVisible(false);
		tglbtnAtrsMR.setVisible(false);
		tglbtnSiguiente3.setVisible(false);

		//Para evitar overlap en el panel anterior al que corresponden
		//Botones los detalles de la MotherBoard
				
		JRadioButton rdbtnDdrMB = new JRadioButton("DDR");
		rdbtnDdrMB.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnDdr_3MR.setActionCommand( 
				rdbtnDdr_3MR.getText() );
		JRadioButton rdbtnDdr_2MB = new JRadioButton("DDR-2");
		rdbtnDdr_2MB.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnDdr_2MB.setActionCommand( 
				rdbtnDdr_2MB.getText() );
		JRadioButton rdbtnDdr_3MB = new JRadioButton("DDR-3");
		rdbtnDdr_3MB.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnDdr_3MB.setActionCommand( 
				rdbtnDdr_3MB.getText() );
		JRadioButton rdbtnDdr_4MB = new JRadioButton("DDR-4");
		rdbtnDdr_4MB.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnDdr_4MB.setActionCommand( 
				rdbtnDdr_4MB.getText() );
		JRadioButton rdbtnIdeMB = new JRadioButton("IDE");
		rdbtnIdeMB.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnIdeMB.setActionCommand( 
				rdbtnIdeMB.getText() );
		JRadioButton rdbtnSataMB = new JRadioButton("SATA");
		rdbtnSataMB.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnSataMB.setActionCommand( 
				rdbtnSataMB.getText() );
		JRadioButton rdbtnSata_2MB = new JRadioButton("SATA-2");
		rdbtnSata_2MB.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnSata_2MB.setActionCommand( 
				rdbtnSata_2MB.getText() );
		JRadioButton rdbtnSata_3MB = new JRadioButton("SATA-3");
		rdbtnSata_3MB.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnSata_3MB.setActionCommand( 
				rdbtnSata_3MB.getText() );
		
		JToggleButton tglbtnAtrsMB = new JToggleButton("Atrás");
		JToggleButton tglbtnSiguienteMB = new JToggleButton("Siguiente");
		
		rdbtnDdrMB.setVisible(false);
		rdbtnDdr_2MB.setVisible(false);
		rdbtnDdr_3MB.setVisible(false);
		rdbtnDdr_4MB.setVisible(false);
		rdbtnIdeMB.setVisible(false);
		rdbtnSataMB.setVisible(false);
		rdbtnSata_2MB.setVisible(false);
		rdbtnSata_3MB.setVisible(false);
		tglbtnAtrsMB.setVisible(false);
		tglbtnSiguienteMB.setVisible(false);
		
		//Para evitar overlap en el panel anterior al que corresponden
		//Botones los detalles del Microprocesador
						
		
		JRadioButton rdbtnGh = new JRadioButton("GHz");
		rdbtnGh.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnGh.setActionCommand( 
				rdbtnGh.getText() );
		JRadioButton rdbtnMhz = new JRadioButton("MHz");
		rdbtnMhz.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnMhz.setActionCommand( 
				rdbtnMhz.getText() );
		
		rdbtnGh.setVisible(false);
		rdbtnMhz.setVisible(false);
		
		JToggleButton tglbtnAtrsMP = new JToggleButton("Atrás");
		JToggleButton tglbtnSiguienteMP = new JToggleButton("Siguiente");
		JToggleButton tglbtnAtrsDD = new JToggleButton("Atrás");
		JToggleButton tglbtnSiguiente1 = new JToggleButton("Siguiente");
		JToggleButton tglbtnVolverAComprar = new JToggleButton("Volver a Comprar");
		JToggleButton tglbtnEliminarProducto = new JToggleButton("Eliminar producto");	
		JToggleButton tglbtnRealizarCompra = new JToggleButton("Realizar Compra");

		tglbtnAtrsMP.setVisible(false);
		tglbtnSiguienteMP.setVisible(false);
		tglbtnAtrsDD.setVisible(false);
		tglbtnSiguiente1.setVisible(false);
		tglbtnVolverAComprar.setVisible(false);
		tglbtnEliminarProducto.setVisible(false);
		tglbtnRealizarCompra.setVisible(false);
		
		ArrayList <Factura> factura = new ArrayList<Factura>();
		ArrayList <Componente> componente = new ArrayList<Componente>();	
		
		
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);	
		
	//Panel para elegir el producto	
		
		panel_productoaelegir.setBounds(12, 52, 554, 228);
		contentPanel.add(panel_productoaelegir);
		panel_productoaelegir.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		panel_productoaelegir.setLayout(null);
		
		
		JRadioButton rdbtnDiscoDuro = new JRadioButton("Disco duro");
		rdbtnDiscoDuro.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnDiscoDuro.setBounds(8, 77, 149, 23);
		panel_productoaelegir.add(rdbtnDiscoDuro);
		
		JLabel lblProductoAComprar = new JLabel("Producto a comprar:");
		lblProductoAComprar.setFont(new Font("Dialog", Font.BOLD, 14));
		lblProductoAComprar.setBounds(8, 12, 204, 15);
		panel_productoaelegir.add(lblProductoAComprar);
		
		JRadioButton rdbtnMotherboard = new JRadioButton("MotherBoard");
		rdbtnMotherboard.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnMotherboard.setBounds(8, 141, 149, 23);
		panel_productoaelegir.add(rdbtnMotherboard);
		
		JRadioButton rdbtnMemoriaRam = new JRadioButton("Memoria RAM");
		rdbtnMemoriaRam.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnMemoriaRam.setBounds(325, 77, 149, 23);
		panel_productoaelegir.add(rdbtnMemoriaRam);
		
		JRadioButton rdbtnMicroprocesador = new JRadioButton(" Microprocesador");
		rdbtnMicroprocesador.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnMicroprocesador.setBounds(325, 141, 188, 23);
		panel_productoaelegir.add(rdbtnMicroprocesador);
		
	
		
		rdbtnDiscoDuro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnDiscoDuro.setSelected(true);
				rdbtnMotherboard.setSelected(false);
				rdbtnMemoriaRam.setSelected(false);
				rdbtnMicroprocesador.setSelected(false);
			}
		});
		
		rdbtnMemoriaRam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnDiscoDuro.setSelected(false);
				rdbtnMotherboard.setSelected(false);
				rdbtnMemoriaRam.setSelected(true);
				rdbtnMicroprocesador.setSelected(false);
				
			}
		});
		
		rdbtnMotherboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnDiscoDuro.setSelected(false);
				rdbtnMotherboard.setSelected(true);
				rdbtnMemoriaRam.setSelected(false);
				rdbtnMicroprocesador.setSelected(false);
			}
		});
		
		rdbtnMicroprocesador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnDiscoDuro.setSelected(false);
				rdbtnMotherboard.setSelected(false);
				rdbtnMemoriaRam.setSelected(false);
				rdbtnMicroprocesador.setSelected(true);
			}
		});
		
		JToggleButton tglbtnSiguiente = new JToggleButton("Siguiente");
		tglbtnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnDiscoDuro.isSelected()) {
					Producto = "Disco Duro";
				}else if(rdbtnMotherboard.isSelected()) {
					Producto = "Mother Board";
				}else if(rdbtnMemoriaRam.isSelected()) {
					Producto = "Memoria Ram";
				}else if(rdbtnMicroprocesador.isSelected()) {
					Producto = "Microprocesador";
				}
		//		System.out.println(Producto);
					if(rdbtnDiscoDuro.isSelected()) {				
						panel_productoaelegir.setVisible(false);
						panel_DiscoDuro.setVisible(true);
						rdbtnTbDD.setVisible(true);
						rdbtnGbDD.setVisible(true);
						panel_ConexionDiscoDuro.setVisible(false);
						panel_MotherBoard.setVisible(false);
					 	panel_Microprocesador.setVisible(false);
						panel_MemoriaRam.setVisible(false);
						panel_CarritoCompras.setVisible(false);
						panel_ProductSelected.setVisible(false);
						tglbtnAtrsMP.setVisible(false);
						tglbtnSiguienteMP.setVisible(false);
						tglbtnAtrsDD.setVisible(true);
						tglbtnSiguiente1.setVisible(true);
						tglbtnVolverAComprar.setVisible(false);
						tglbtnEliminarProducto.setVisible(false);
						tglbtnRealizarCompra.setVisible(false);
					}
					if(rdbtnMemoriaRam.isSelected()) {			
						panel_productoaelegir.setVisible(false);
						panel_DiscoDuro.setVisible(false);
						panel_ConexionDiscoDuro.setVisible(false);
						panel_MotherBoard.setVisible(false);
					 	panel_Microprocesador.setVisible(false);
						panel_MemoriaRam.setVisible(true);
						rdbtnGbMR.setVisible(true);
						rdbtnMbMR.setVisible(true);
						rdbtnDdrMR.setVisible(true);
						rdbtnDdr_1MR.setVisible(true);
						rdbtnDdr_2MR.setVisible(true);
						rdbtnDdr_3MR.setVisible(true);
						tglbtnAtrsMR.setVisible(true);
						tglbtnSiguiente3.setVisible(true);
						panel_CarritoCompras.setVisible(false);
						panel_ProductSelected.setVisible(false);
					}
					if(rdbtnMotherboard.isSelected()) {			
						panel_productoaelegir.setVisible(false);
						panel_DiscoDuro.setVisible(false);
						panel_ConexionDiscoDuro.setVisible(false);
						panel_MotherBoard.setVisible(true);
						rdbtnDdrMB.setVisible(true);
						rdbtnDdr_2MB.setVisible(true);
						rdbtnDdr_3MB.setVisible(true);
						rdbtnDdr_4MB.setVisible(true);
						tglbtnAtrsMB.setVisible(true);
						tglbtnSiguienteMB.setVisible(true);
						rdbtnIdeMB.setVisible(true);
						rdbtnSataMB.setVisible(true);
						rdbtnSata_2MB.setVisible(true);
						rdbtnSata_3MB.setVisible(true);
					 	panel_Microprocesador.setVisible(false);
						panel_MemoriaRam.setVisible(false);
						panel_CarritoCompras.setVisible(false);
						panel_ProductSelected.setVisible(false);
					}
					if(rdbtnMicroprocesador.isSelected()) {			
						panel_productoaelegir.setVisible(false);
						panel_DiscoDuro.setVisible(false);
						panel_ConexionDiscoDuro.setVisible(false);
						panel_MotherBoard.setVisible(false);
					 	panel_Microprocesador.setVisible(true);
					 	rdbtnGh.setVisible(true);
						rdbtnMhz.setVisible(true);
						panel_MemoriaRam.setVisible(false);
						panel_CarritoCompras.setVisible(false);
						panel_ProductSelected.setVisible(false);
						tglbtnAtrsMP.setVisible(true);
						tglbtnSiguienteMP.setVisible(true);
						tglbtnAtrsDD.setVisible(false);
						tglbtnSiguiente1.setVisible(false);
						tglbtnVolverAComprar.setVisible(false);
						tglbtnEliminarProducto.setVisible(false);
						tglbtnRealizarCompra.setVisible(false);
					}
				
				}
			
		});
		
		tglbtnSiguiente.setBounds(424, 191, 118, 25);
		panel_productoaelegir.add(tglbtnSiguiente);
		
		
		//Panel para elegir MotherBoard Conexion y Compatibilidad con RAM
		
		
			
			panel_MotherBoard.setBounds(12, 52, 554, 228);
			contentPanel.add(panel_MotherBoard);
			contentPanel.setLayout(null);
			setLocationRelativeTo(null);
			panel_MotherBoard.setLayout(null);
			
			{
				JLabel lblCompatibleConRam = new JLabel("Compatible con RAM:");
				lblCompatibleConRam.setFont(new Font("Dialog", Font.BOLD, 14));
				lblCompatibleConRam.setBounds(2, 34, 200, 15);
				panel_MotherBoard.add(lblCompatibleConRam);
			}
			{
				JLabel lblConexionesDeDisco = new JLabel("Conexiones de Disco Duro: ");
				lblConexionesDeDisco.setBounds(2, 116, 200, 15);
				panel_MotherBoard.add(lblConexionesDeDisco);
			}

			
			rdbtnDdrMB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnDdrMB.setSelected(true);
					rdbtnDdr_2MB.setSelected(false);
					rdbtnDdr_3MB.setSelected(false);
					rdbtnDdr_4MB.setSelected(false);
				}
			});
			rdbtnDdrMB.setBounds(12, 57, 149, 23);
			panel_MotherBoard.add(rdbtnDdrMB);
			
			rdbtnDdr_2MB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnDdrMB.setSelected(false);
					rdbtnDdr_2MB.setSelected(true);
					rdbtnDdr_3MB.setSelected(false);
					rdbtnDdr_4MB.setSelected(false);
				}
			});
			rdbtnDdr_2MB.setBounds(12, 84, 149, 23);
			panel_MotherBoard.add(rdbtnDdr_2MB);
			
			rdbtnDdr_3MB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnDdrMB.setSelected(false);
					rdbtnDdr_2MB.setSelected(false);
					rdbtnDdr_3MB.setSelected(true);
					rdbtnDdr_4MB.setSelected(false);
				}
			});
			rdbtnDdr_3MB.setBounds(321, 57, 149, 23);
			panel_MotherBoard.add(rdbtnDdr_3MB);
			
			rdbtnDdr_4MB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnDdrMB.setSelected(false);
					rdbtnDdr_2MB.setSelected(false);
					rdbtnDdr_3MB.setSelected(false);
					rdbtnDdr_4MB.setSelected(true);
				}
			});
			rdbtnDdr_4MB.setBounds(321, 84, 149, 23);
			panel_MotherBoard.add(rdbtnDdr_4MB);
			

			
			rdbtnIdeMB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnIdeMB.setSelected(true);
					rdbtnSataMB.setSelected(false);
					rdbtnSata_2MB.setSelected(false);
					rdbtnSata_3MB.setSelected(false);
				}
			});
			rdbtnIdeMB.setBounds(12, 139, 149, 23);
			panel_MotherBoard.add(rdbtnIdeMB);
			
			rdbtnSataMB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnIdeMB.setSelected(false);
					rdbtnSataMB.setSelected(true);
					rdbtnSata_2MB.setSelected(false);
					rdbtnSata_3MB.setSelected(false);
				}
			});
			rdbtnSataMB.setBounds(12, 166, 149, 23);
			panel_MotherBoard.add(rdbtnSataMB);
			
			rdbtnSata_2MB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnIdeMB.setSelected(false);
					rdbtnSataMB.setSelected(false);
					rdbtnSata_2MB.setSelected(true);
					rdbtnSata_3MB.setSelected(false);
				}
			});
			rdbtnSata_2MB.setBounds(321, 139, 149, 23);
			panel_MotherBoard.add(rdbtnSata_2MB);
			
			rdbtnSata_3MB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnIdeMB.setSelected(false);
					rdbtnSataMB.setSelected(false);
					rdbtnSata_2MB.setSelected(false);
					rdbtnSata_3MB.setSelected(true);
				}
			});
			rdbtnSata_3MB.setBounds(321, 166, 149, 23);
			panel_MotherBoard.add(rdbtnSata_3MB);
			
			
			tglbtnAtrsMB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//volver a elegir producto
					panel_productoaelegir.setVisible(true);
					panel_DiscoDuro.setVisible(false);
					panel_ConexionDiscoDuro.setVisible(false);
					panel_MotherBoard.setVisible(false);
				 	panel_Microprocesador.setVisible(false);
					panel_MemoriaRam.setVisible(false);
					panel_CarritoCompras.setVisible(false);
					panel_ProductSelected.setVisible(false);
				}
			});
			tglbtnAtrsMB.setBounds(12, 197, 72, 25);
			panel_MotherBoard.add(tglbtnAtrsMB);

			
			tglbtnSiguienteMB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(rdbtnDdrMB.isSelected()) {
						CompMBconRAM = "DDR";
					}else if(rdbtnDdr_2MB.isSelected()) {
						CompMBconRAM = "DDR-2";
					}else if(rdbtnDdr_3MB.isSelected()) {
						CompMBconRAM = "DDR-3";
					}else if(rdbtnDdr_4MB.isSelected()) {
						CompMBconRAM = "DDR-4";
					}
		//			System.out.println(CompMBconRAM);
					if(rdbtnIdeMB.isSelected()) {
						ConMBconDD = "IDE";
					}else if(rdbtnSataMB.isSelected()) {
						ConMBconDD = "SATA";
					}else if(rdbtnSata_2MB.isSelected()) {
						ConMBconDD = "SATA-2";
					}else if(rdbtnSata_3MB.isSelected()) {
						ConMBconDD = "SATA-3";
					}
					System.out.println(ConMBconDD);
					//proceder a encontrar producto
					panel_productoaelegir.setVisible(false);
					panel_DiscoDuro.setVisible(false);
					panel_ConexionDiscoDuro.setVisible(false);
					panel_MotherBoard.setVisible(false);
				 	panel_Microprocesador.setVisible(false);
					panel_MemoriaRam.setVisible(false);
					panel_CarritoCompras.setVisible(false);
					panel_ProductSelected.setVisible(true);
				}
			});
			tglbtnSiguienteMB.setBounds(418, 197, 124, 25);
			panel_MotherBoard.add(tglbtnSiguienteMB);
			
			JLabel lblMotherboard = new JLabel("MotherBoard");
			lblMotherboard.setFont(new Font("Dialog", Font.BOLD, 16));
			lblMotherboard.setBounds(196, 8, 131, 15);
			panel_MotherBoard.add(lblMotherboard);	
			
			
		//Panel para elegir velocidad del microprocesador
			
			panel_Microprocesador.setBounds(12, 52, 554, 228);
			contentPanel.add(panel_Microprocesador);
			contentPanel.setLayout(null);
			setLocationRelativeTo(null);
			
			panel_Microprocesador.setLayout(null);
			{
				JLabel lblVelocidadDelMicroprocesador = new JLabel("Velocidad del Microprocesador:");
				lblVelocidadDelMicroprocesador.setFont(new Font("Dialog", Font.BOLD, 14));
				lblVelocidadDelMicroprocesador.setBounds(8, 57, 270, 15);
				panel_Microprocesador.add(lblVelocidadDelMicroprocesador);
			}
			
			rdbtnGh.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnGh.setSelected(true);
					rdbtnMhz.setSelected(false);
				}
			});
			rdbtnGh.setBounds(8, 103, 149, 23);
			panel_Microprocesador.add(rdbtnGh);
			
			rdbtnMhz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnMhz.setSelected(true);
					rdbtnGh.setSelected(false);
				}
			});
			
			rdbtnMhz.setBounds(348, 103, 149, 23);
			panel_Microprocesador.add(rdbtnMhz);
			
			
			{
				
				tglbtnAtrsMP.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel_productoaelegir.setVisible(true);
						panel_DiscoDuro.setVisible(false);
						panel_ConexionDiscoDuro.setVisible(false);
						panel_MotherBoard.setVisible(false);
					 	panel_Microprocesador.setVisible(false);
						panel_MemoriaRam.setVisible(false);
						panel_CarritoCompras.setVisible(false);
						panel_ProductSelected.setVisible(false);
						
					}
				});
				tglbtnAtrsMP.setBounds(12, 197, 95, 25);
				panel_Microprocesador.add(tglbtnAtrsMP);
			}
			{
				
				tglbtnSiguienteMP.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
										
						if(rdbtnGh.isSelected()) {
							MPvelocidad = true;
						}else if(rdbtnMhz.isSelected()) {
							MPvelocidad = false;
							}
						
				//		System.out.println(MPvelocidad);
						
						panel_productoaelegir.setVisible(false);
						panel_DiscoDuro.setVisible(false);
						panel_ConexionDiscoDuro.setVisible(false);
						panel_MotherBoard.setVisible(false);
					 	panel_Microprocesador.setVisible(false);
						panel_MemoriaRam.setVisible(false);
						panel_CarritoCompras.setVisible(false);
						panel_ProductSelected.setVisible(true);
					}
				});
				tglbtnSiguienteMP.setBounds(428, 197, 114, 25);
				panel_Microprocesador.add(tglbtnSiguienteMP);
			}
			{
				JLabel lblMicroprocesador = new JLabel("Microprocesador");
				lblMicroprocesador.setFont(new Font("Dialog", Font.BOLD, 16));
				lblMicroprocesador.setBounds(208, 8, 156, 15);
				panel_Microprocesador.add(lblMicroprocesador);
			}
		
		
		
		
		//Panel para elegir datos de la memoria RAM
		
		 
			panel_MemoriaRam.setBounds(12, 52, 554, 228);
			contentPanel.add(panel_MemoriaRam);
			contentPanel.setLayout(null);
			setLocationRelativeTo(null);
			panel_MemoriaRam.setLayout(null);
			
			JLabel lblCantidadDeAlmacenamiento = new JLabel("Cantidad de Almacenamiento:");
			lblCantidadDeAlmacenamiento.setFont(new Font("Dialog", Font.BOLD, 14));
			lblCantidadDeAlmacenamiento.setBounds(12, 31, 259, 15);
			panel_MemoriaRam.add(lblCantidadDeAlmacenamiento);
			
		
			
			rdbtnGbMR.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnMbMR.setSelected(false);
					rdbtnGbMR.setSelected(true);
				}
			});
			
			
			rdbtnMbMR.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnMbMR.setSelected(true);
					rdbtnGbMR.setSelected(false);
				}
			});
			rdbtnMbMR.setBounds(12, 54, 149, 23);
			panel_MemoriaRam.add(rdbtnMbMR);
			
			
			rdbtnGbMR.setBounds(338, 54, 149, 23);
			panel_MemoriaRam.add(rdbtnGbMR);
			
			JLabel lblTipo = new JLabel("Tipo:");
			lblTipo.setFont(new Font("Dialog", Font.BOLD, 14));
			lblTipo.setBounds(12, 96, 70, 15);
			panel_MemoriaRam.add(lblTipo);
			
		
			
			rdbtnDdr_3MR.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnDdrMR.setSelected(false);
					rdbtnDdr_1MR.setSelected(false);
					rdbtnDdr_2MR.setSelected(false);
					rdbtnDdr_3MR.setSelected(true);
				}
			});
			rdbtnDdr_2MR.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					rdbtnDdrMR.setSelected(false);
					rdbtnDdr_1MR.setSelected(false);
					rdbtnDdr_2MR.setSelected(true);
					rdbtnDdr_3MR.setSelected(false);
				}
			});
			
			
			rdbtnDdr_1MR.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnDdrMR.setSelected(false);
					rdbtnDdr_1MR.setSelected(true);
					rdbtnDdr_2MR.setSelected(false);
					rdbtnDdr_3MR.setSelected(false);
				}
			});
	
			rdbtnDdrMR.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnDdrMR.setSelected(true);
					rdbtnDdr_1MR.setSelected(false);
					rdbtnDdr_2MR.setSelected(false);
					rdbtnDdr_3MR.setSelected(false);
				}
			});
			rdbtnDdrMR.setBounds(12, 119, 149, 23);
			panel_MemoriaRam.add(rdbtnDdrMR);
			
			
			rdbtnDdr_1MR.setBounds(12, 144, 149, 23);
			panel_MemoriaRam.add(rdbtnDdr_1MR);
			
			
			rdbtnDdr_2MR.setBounds(338, 119, 149, 23);
			panel_MemoriaRam.add(rdbtnDdr_2MR);
			
			
			rdbtnDdr_3MR.setBounds(338, 144, 149, 23);
			panel_MemoriaRam.add(rdbtnDdr_3MR);
			
			JLabel lblMemoriaRam = new JLabel("Memoria RAM");
			lblMemoriaRam.setFont(new Font("Dialog", Font.BOLD, 16));
			lblMemoriaRam.setBounds(197, 4, 130, 15);
			panel_MemoriaRam.add(lblMemoriaRam);
			

			tglbtnAtrsMR.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_productoaelegir.setVisible(true);
					panel_DiscoDuro.setVisible(false);
					panel_ConexionDiscoDuro.setVisible(false);
					panel_MotherBoard.setVisible(false);
				 	panel_Microprocesador.setVisible(false);
					panel_MemoriaRam.setVisible(false);
					panel_CarritoCompras.setVisible(false);
					panel_ProductSelected.setVisible(false);
				}
			});
			tglbtnAtrsMR.setBounds(12, 197, 104, 25);
			panel_MemoriaRam.add(tglbtnAtrsMR);
			
			
			tglbtnSiguiente3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {					
					if(rdbtnMbMR.isSelected()) {
						MRAMAlma = "MB";
					}else if(rdbtnGbMR.isSelected()) {
						MRAMAlma = "GB";
					}
			//		System.out.println(MRAMAlma);
					
					if(rdbtnDdrMR.isSelected()) {
						TipoRAM = "DDR";
					}else if(rdbtnDdr_1MR.isSelected()) {
						TipoRAM = "DDR-2";
					}else if(rdbtnDdr_2MR.isSelected()) {
						TipoRAM = "DDR-3";
					}else if(rdbtnDdr_3MR.isSelected()) {
						TipoRAM = "DDR-4";
					}
			//		System.out.println(TipoRAM);
					
					panel_productoaelegir.setVisible(false);
					panel_DiscoDuro.setVisible(false);
					panel_ConexionDiscoDuro.setVisible(false);
					panel_MotherBoard.setVisible(false);
				 	panel_Microprocesador.setVisible(false);
					panel_MemoriaRam.setVisible(false);
					panel_CarritoCompras.setVisible(false);
					panel_ProductSelected.setVisible(true);
				}
			});
			tglbtnSiguiente3.setBounds(412, 197, 130, 25);
			panel_MemoriaRam.add(tglbtnSiguiente3);
		
		//Panel para pedir Tipo de Almacenamiento del Disco Duro
		
	
		panel_DiscoDuro.setBounds(12, 52, 554, 228);
		contentPanel.add(panel_DiscoDuro);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		panel_DiscoDuro.setLayout(null);

		{
			JLabel lblDiscoDuro = new JLabel("Disco Duro");
			lblDiscoDuro.setFont(new Font("Dialog", Font.BOLD, 16));
			lblDiscoDuro.setBounds(221, 6, 104, 15);
			panel_DiscoDuro.add(lblDiscoDuro);
			JLabel lblAlmacenamiento = new JLabel("Almacenamiento: ");
			lblAlmacenamiento.setFont(new Font("Dialog", Font.BOLD, 14));
			lblAlmacenamiento.setBounds(12, 34, 161, 15);
			panel_DiscoDuro.add(lblAlmacenamiento);
		}
	
			rdbtnTbDD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnGbDD.setSelected(false);
					rdbtnTbDD.setSelected(true);
				}
			});
			
			rdbtnGbDD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					rdbtnGbDD.setSelected(true);
					rdbtnTbDD.setSelected(false);
				}
			});
			rdbtnGbDD.setBounds(12, 81, 149, 23);
			panel_DiscoDuro.add(rdbtnGbDD);
			
			
			rdbtnTbDD.setBounds(12, 140, 149, 23);
			
			panel_DiscoDuro.add(rdbtnTbDD);
			
			tglbtnAtrsDD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_productoaelegir.setVisible(true);
					panel_DiscoDuro.setVisible(false);
					panel_ConexionDiscoDuro.setVisible(false);
					panel_MotherBoard.setVisible(false);
				 	panel_Microprocesador.setVisible(false);
					panel_MemoriaRam.setVisible(false);
					panel_CarritoCompras.setVisible(false);
					panel_ProductSelected.setVisible(false);
				}
			});
			tglbtnAtrsDD.setBounds(12, 197, 82, 25);
				panel_DiscoDuro.add(tglbtnAtrsDD);
				
				
			tglbtnSiguiente1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rdbtnGbDD.isSelected()) {
						DDAlma = false;
					}else if(rdbtnTbDD.isSelected()) {
						DDAlma = true;
					}
					
			//		System.out.println(DDAlma);
			 
					panel_productoaelegir.setVisible(false);
					panel_DiscoDuro.setVisible(false);
					panel_ConexionDiscoDuro.setVisible(true);
					rdbtnSataDD.setVisible(true);
					rdbtnIDEDD.setVisible(true);
					rdbtnSata2DD.setVisible(true);
					rdbtnSata3DD.setVisible(true);
					panel_MotherBoard.setVisible(false);
				 	panel_Microprocesador.setVisible(false);
					panel_MemoriaRam.setVisible(false);
					panel_CarritoCompras.setVisible(false);
					panel_ProductSelected.setVisible(false);

				}
			});
			
			tglbtnSiguiente1.setBounds(424, 197, 118, 25);
			panel_DiscoDuro.add(tglbtnSiguiente1);
		
		
		
		// Panel para pedir el tipo de conexión del Disco Duro
		
		panel_ConexionDiscoDuro.setBounds(12, 52, 554, 228);
		contentPanel.add(panel_ConexionDiscoDuro);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		panel_ConexionDiscoDuro.setLayout(null);

		
		
			JLabel lblAlmacenamiento = new JLabel("Tipo de conexión:");
			lblAlmacenamiento.setFont(new Font("Dialog", Font.BOLD, 14));
			lblAlmacenamiento.setBounds(12, 39, 202, 15);
			panel_ConexionDiscoDuro.add(lblAlmacenamiento);
		
			rdbtnIDEDD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnIDEDD.setSelected(true);
					rdbtnSataDD.setSelected(false);
					rdbtnSata2DD.setSelected(false);
					rdbtnSata3DD.setSelected(false);
				}
			});
			rdbtnIDEDD.setBounds(12, 72, 149, 23);
			panel_ConexionDiscoDuro.add(rdbtnIDEDD);
		
		
			
			rdbtnSataDD.setBounds(397, 72, 149, 23);
			panel_ConexionDiscoDuro.add(rdbtnSataDD);
			rdbtnSataDD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnIDEDD.setSelected(false);
					rdbtnSataDD.setSelected(true);
					rdbtnSata2DD.setSelected(false);
					rdbtnSata3DD.setSelected(false);
				}
			});
		
			rdbtnSata2DD.setBounds(12, 127, 149, 23);
			panel_ConexionDiscoDuro.add(rdbtnSata2DD);
			rdbtnSata2DD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnIDEDD.setSelected(false);
					rdbtnSataDD.setSelected(false);
					rdbtnSata2DD.setSelected(true);
					rdbtnSata3DD.setSelected(false);
				}
			});
		
			rdbtnSata3DD.setBounds(397, 127, 149, 23);
			panel_ConexionDiscoDuro.add(rdbtnSata3DD);
			rdbtnSata3DD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnIDEDD.setSelected(false);
					rdbtnSataDD.setSelected(false);
					rdbtnSata2DD.setSelected(false);
					rdbtnSata3DD.setSelected(true);
				}
			});
	
		
			JToggleButton tglbtnAtrsDD2 = new JToggleButton("Atrás");
			tglbtnAtrsDD2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_productoaelegir.setVisible(false);
					panel_DiscoDuro.setVisible(true);
					panel_ConexionDiscoDuro.setVisible(false);
					panel_MotherBoard.setVisible(false);
				 	panel_Microprocesador.setVisible(false);
					panel_MemoriaRam.setVisible(false);
					panel_CarritoCompras.setVisible(false);
					panel_ProductSelected.setVisible(false);
				}
			});
			tglbtnAtrsDD2.setBounds(12, 197, 82, 25);
			panel_ConexionDiscoDuro.add(tglbtnAtrsDD2);
			
			JToggleButton tglbtnSiguienteDD2 = new JToggleButton("Siguiente");
			tglbtnSiguienteDD2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rdbtnIDEDD.isSelected()) {
						ConexionDD = "IDE";
					}else if(rdbtnSataDD.isSelected()) {
						ConexionDD = "SATA";
					}else if(rdbtnSata2DD.isSelected()) {
						ConexionDD = "SATA-2";
					}else if(rdbtnSata3DD.isSelected()) {
						ConexionDD = "SATA-3";
					}
				//	System.out.println(ConexionDD);
					
					panel_productoaelegir.setVisible(false);
					panel_DiscoDuro.setVisible(false);
					panel_ConexionDiscoDuro.setVisible(false);
					panel_MotherBoard.setVisible(false);
				 	panel_Microprocesador.setVisible(false);
					panel_MemoriaRam.setVisible(false);
					panel_CarritoCompras.setVisible(false);
					panel_ProductSelected.setVisible(true);
					Component = Producto;
					if(Component == "Disco Duro") {
						ped2 = ConMBconDD;
						ped3 = null;
					}else if (Component == "Microprocesador") {
						ped2 = null;
						ped3 = null;
					}else if (Component == "Motherboard") {
						ped2 = CompMBconRAM;
						ped3 = ConMBconDD;
					}else if (Component == "Memoria Ram") {
						ped2 = MRAMAlma;
						ped3 = null;
					}
				}
			});
			tglbtnSiguienteDD2.setBounds(424, 197, 118, 25);
			panel_ConexionDiscoDuro.add(tglbtnSiguienteDD2);
		
			JLabel lblDiscoDuro = new JLabel("Disco Duro");
			lblDiscoDuro.setFont(new Font("Dialog", Font.BOLD, 16));
			lblDiscoDuro.setBounds(223, 8, 105, 15);
			panel_ConexionDiscoDuro.add(lblDiscoDuro);
			
		
	
		//Panel para elegir los productos con las caracteristicas elegidas
		
		panel_CarritoCompras.setVisible(false);
		panel_ProductSelected.setBounds(12, 52, 554, 228);
		contentPanel.add(panel_ProductSelected);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		panel_ProductSelected.setLayout(null);
		
		txtVariables = new JTextField();
		txtVariables.setEditable(false);
		//presentar las opciones elegidas

	
		

		
		
		JLabel lblProductosQueCumplen = new JLabel("Productos que cumplen con las características:");
		lblProductosQueCumplen.setFont(new Font("Dialog", Font.BOLD, 16));
		lblProductosQueCumplen.setBounds(68, 10, 437, 15);
		panel_ProductSelected.add(lblProductosQueCumplen);
		
		table_2 = new JTable();
		table_2.setFont(new Font("Dialog", Font.BOLD, 12));
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"#", "Marca", "Modelo", "Precio"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table_2.setBounds(0, 42, 542, 120);
		panel_ProductSelected.add(table_2);
		
		panel_ProductSelected.setBounds(12, 44, 554, 228);
		contentPanel.add(panel_ProductSelected);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		panel_ProductSelected.setLayout(null);
		
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"#", "Marca", "Modelo", "Almacenamiento", "Precio"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table_2.setBounds(0, 42, 542, 137);
		panel_ProductSelected.add(table_2);
		
		JToggleButton tglbtnAtrsPS = new JToggleButton("Atrás");
		tglbtnAtrsPS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_productoaelegir.setVisible(true);
				panel_DiscoDuro.setVisible(false);
				panel_ConexionDiscoDuro.setVisible(false);
				panel_MotherBoard.setVisible(false);
			 	panel_Microprocesador.setVisible(false);
				panel_MemoriaRam.setVisible(false);
				panel_CarritoCompras.setVisible(false);
				panel_ProductSelected.setVisible(false);
				tglbtnAtrsMP.setVisible(false);
				tglbtnSiguienteMP.setVisible(false);
				tglbtnAtrsDD.setVisible(false);
				tglbtnSiguiente1.setVisible(false);
				tglbtnVolverAComprar.setVisible(false);
				tglbtnEliminarProducto.setVisible(false);
				tglbtnRealizarCompra.setVisible(false);
				
			}
		});
		tglbtnAtrsPS.setBounds(0, 197, 93, 25);
		panel_ProductSelected.add(tglbtnAtrsPS);
		
		JToggleButton tglbtnVerCarrito = new JToggleButton("Ver Carrito");
		tglbtnVerCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_productoaelegir.setVisible(false);
				panel_DiscoDuro.setVisible(false);
				panel_ConexionDiscoDuro.setVisible(false);
				panel_MotherBoard.setVisible(false);
			 	panel_Microprocesador.setVisible(false);
				panel_MemoriaRam.setVisible(false);
				panel_CarritoCompras.setVisible(true);
				panel_ProductSelected.setVisible(false);
				tglbtnAtrsMP.setVisible(false);
				tglbtnSiguienteMP.setVisible(false);
				tglbtnAtrsDD.setVisible(false);
				tglbtnSiguiente1.setVisible(false);
				tglbtnVolverAComprar.setVisible(true);
				tglbtnEliminarProducto.setVisible(true);
				tglbtnRealizarCompra.setVisible(true);
				
			}
		});
		tglbtnVerCarrito.setBounds(166, 197, 167, 25);
		panel_ProductSelected.add(tglbtnVerCarrito);
		Tienda t = null;
		Componente c = null;
		Tienda find;
		int row_number = 1;
		JToggleButton tglbtnAgregarAlCarrito = new JToggleButton("Agregar al Carrito");
		tglbtnAgregarAlCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				t.buscarComponentes(Component, bol, ped2, ped3);
				table_carrocompras.setAutoCreateRowSorter(true);
				DefaultTableModel model = (DefaultTableModel) table_carrocompras.getModel();
				String data[] = {};
			//	String data[] = {Integer.toString(model.getRowCount()+1),};
			//	{"#", "Marca", "Modelo", "Almacenamiento", "Precio"},
				
				 model.addRow(data);
				
				
			}
		});
		tglbtnAgregarAlCarrito.setBounds(375, 197, 167, 25);
		panel_ProductSelected.add(tglbtnAgregarAlCarrito);
		
		 
		 //Panel Carrito de compras
		  
		 {

			panel_CarritoCompras.setBounds(12, 52, 554, 228);
			contentPanel.add(panel_CarritoCompras);
			contentPanel.setLayout(null);
			setLocationRelativeTo(null);
			panel_CarritoCompras.setLayout(null);
			{
				JLabel lblCarritoDeCompras = new JLabel("Carrito de Compras");
				lblCarritoDeCompras.setFont(new Font("Dialog", Font.BOLD, 16));
				lblCarritoDeCompras.setBounds(189, 5, 193, 15);
				panel_CarritoCompras.add(lblCarritoDeCompras);
			}
			
				table_carrocompras = new JTable(1,6);
				table_carrocompras.setFont(new Font("Dialog", Font.BOLD, 12));
				table_carrocompras.setModel(new DefaultTableModel(
					new Object[][] {
						{"#", "Producto", "Marca", "Modelo", "Cantidad", "Precio"},
					},
					new String[] {
						"New column", "New column", "New column", "New column", "New column", "New column"
					}
				));
				table_carrocompras.setBounds(10, 25, 532, 133);
				panel_CarritoCompras.add(table_carrocompras);
				
				
				
			
			{	
				tglbtnVolverAComprar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel_productoaelegir.setVisible(true);
						panel_DiscoDuro.setVisible(false);
						rdbtnTbDD.setVisible(false);
						rdbtnGbDD.setVisible(false);
						panel_ConexionDiscoDuro.setVisible(false);
						panel_MotherBoard.setVisible(false);
					 	panel_Microprocesador.setVisible(false);
						panel_MemoriaRam.setVisible(false);
						panel_CarritoCompras.setVisible(false);
						panel_ProductSelected.setVisible(false);
					}
				});
				tglbtnVolverAComprar.setBounds(12, 197, 163, 25);
				panel_CarritoCompras.add(tglbtnVolverAComprar);
			}
				Factura f = new Factura(null, null, componente, null, null, (float) 0.0);
				
				tglbtnRealizarCompra.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						factura.add(f);
					}
				});
				tglbtnRealizarCompra.setBounds(202, 197, 150, 25);
				panel_CarritoCompras.add(tglbtnRealizarCompra);
			
			{
				JLabel lblTotalAPagar = new JLabel("Total a pagar: ");
				lblTotalAPagar.setBounds(170, 170, 104, 15);
				panel_CarritoCompras.add(lblTotalAPagar);
			}
			{
				Factura get = f;
			//	String costo =  Float.toString(f.getPrecioTotal());
				String costo = "0.0"; //para probar
				CostoTotal = new JTextField(costo);
				CostoTotal.setEditable(false);
				CostoTotal.setBounds(280, 166, 115, 19);
				panel_CarritoCompras.add(CostoTotal);
				CostoTotal.setColumns(10);
			}
		}
		 
		
		 tglbtnEliminarProducto.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		DefaultTableModel model = (DefaultTableModel) table_carrocompras.getModel();
			//	model.rowsRemoved(event);
		 	}
		 });
		 tglbtnEliminarProducto.setBounds(375, 197, 167, 25);
		 panel_CarritoCompras.add(tglbtnEliminarProducto);
		 
	}
}
