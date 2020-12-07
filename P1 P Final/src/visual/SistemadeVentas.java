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
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
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
	private JTable table_3;
	private JTextField CostoTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		setBounds(100, 100, 578, 331);
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
		rdbtnGbDD.setVisible(false);
		JRadioButton rdbtnTbDD = new JRadioButton("TB");
		rdbtnTbDD.setVisible(false);
		
		//Para evitar overlap en el panel anterior al que corresponden
		//Botones de la conexion de disco duro
		JRadioButton rdbtnIDEDD = new JRadioButton("IDE");
		JRadioButton rdbtnSataDD = new JRadioButton("SATA");
		JRadioButton rdbtnSata2DD = new JRadioButton("SATA-2");
		JRadioButton rdbtnSata3DD = new JRadioButton("SATA-3");
		
		rdbtnSataDD.setVisible(false);
		rdbtnIDEDD.setVisible(false);
		rdbtnSata2DD.setVisible(false);
		rdbtnSata3DD.setVisible(false);
		
		//Para evitar overlap en el panel anterior al que corresponden
		//Botones los detalles de la memoria RAM
		JRadioButton rdbtnGbMR = new JRadioButton("GB");
		JRadioButton rdbtnMbMR = new JRadioButton("MB");
		JRadioButton rdbtnDdrMR = new JRadioButton("DDR");
		JRadioButton rdbtnDdr_1MR = new JRadioButton("DDR-2");
		JRadioButton rdbtnDdr_2MR = new JRadioButton("DDR-3");
		JRadioButton rdbtnDdr_3MR = new JRadioButton("DDR-4");
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
		JRadioButton rdbtnDdr_2MB = new JRadioButton("DDR-2");
		JRadioButton rdbtnDdr_3MB = new JRadioButton("DDR-3");
		JRadioButton rdbtnDdr_4MB = new JRadioButton("DDR-4");
		JRadioButton rdbtnIdeMB = new JRadioButton("IDE");
		JRadioButton rdbtnSataMB = new JRadioButton("SATA");
		JRadioButton rdbtnSata_2MB = new JRadioButton("SATA-2");
		JRadioButton rdbtnSata_3MB = new JRadioButton("SATA-3");
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
		JRadioButton rdbtnMhz = new JRadioButton("MHz");
		rdbtnGh.setVisible(false);
		rdbtnMhz.setVisible(false);
		
		
		
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		
		
		
		
		
	//Panel para elegir el producto	
		
		panel_productoaelegir.setBounds(12, 40, 554, 190);
		contentPanel.add(panel_productoaelegir);
		panel_productoaelegir.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		panel_productoaelegir.setLayout(null);
		
		
		JRadioButton rdbtnDiscoDuro = new JRadioButton("Disco duro");
		rdbtnDiscoDuro.setBounds(8, 35, 149, 23);
		panel_productoaelegir.add(rdbtnDiscoDuro);
		
		JLabel lblProductoAComprar = new JLabel("Producto a comprar:");
		lblProductoAComprar.setBounds(8, 12, 149, 15);
		panel_productoaelegir.add(lblProductoAComprar);
		
		JRadioButton rdbtnMotherboard = new JRadioButton("MotherBoard");
		rdbtnMotherboard.setBounds(8, 92, 149, 23);
		panel_productoaelegir.add(rdbtnMotherboard);
		
		JRadioButton rdbtnMemoriaRam = new JRadioButton("Memoria RAM");
		rdbtnMemoriaRam.setBounds(325, 35, 149, 23);
		panel_productoaelegir.add(rdbtnMemoriaRam);
		
		JRadioButton rdbtnMicroprocesador = new JRadioButton(" Microprocesador");
		rdbtnMicroprocesador.setBounds(325, 92, 149, 23);
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
				if(rdbtnDiscoDuro.isSelected()) {	//si se selecciona disco duro y presiona sigte. sale opciones de Disco Duro			
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
				}
			
			}
		});
		
		tglbtnSiguiente.setBounds(424, 141, 118, 25);
		panel_productoaelegir.add(tglbtnSiguiente);
		
		
		//Panel para elegir MotherBoard Conexion y Compatibilidad con RAM
		
		{
			
			panel_MotherBoard.setBounds(12, 34, 554, 234);
			contentPanel.add(panel_MotherBoard);
			contentPanel.setLayout(null);
			setLocationRelativeTo(null);
			panel_MotherBoard.setLayout(null);
			
			{
				JLabel lblCompatibleConRam = new JLabel("Compatible con RAM:");
				lblCompatibleConRam.setBounds(2, 34, 153, 15);
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
			lblMotherboard.setFont(new Font("Dialog", Font.BOLD, 14));
			lblMotherboard.setBounds(196, 8, 124, 15);
			panel_MotherBoard.add(lblMotherboard);
		}
		
		
		
		
		//Panel para elegir velocidad del microprocesador
		
		{
			
			panel_Microprocesador.setBounds(12, 44, 554, 212);
			contentPanel.add(panel_Microprocesador);
			contentPanel.setLayout(null);
			setLocationRelativeTo(null);
			panel_Microprocesador.setLayout(null);
			{
				JLabel lblVelocidadDelMicroprocesador = new JLabel("Velocidad del Microprocesador:");
				lblVelocidadDelMicroprocesador.setBounds(8, 57, 232, 15);
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
				JToggleButton tglbtnAtrsMP = new JToggleButton("Atrás");
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
				tglbtnAtrsMP.setBounds(12, 175, 95, 25);
				panel_Microprocesador.add(tglbtnAtrsMP);
			}
			{
				JToggleButton tglbtnSiguienteMP = new JToggleButton("Siguiente");
				tglbtnSiguienteMP.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
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
				tglbtnSiguienteMP.setBounds(428, 175, 114, 25);
				panel_Microprocesador.add(tglbtnSiguienteMP);
			}
			{
				JLabel lblMicroprocesador = new JLabel("Microprocesador");
				lblMicroprocesador.setFont(new Font("Dialog", Font.BOLD, 14));
				lblMicroprocesador.setBounds(208, 8, 156, 15);
				panel_Microprocesador.add(lblMicroprocesador);
			}
		}
		
		
		
		//Panel para elegir datos de la memoria RAM
		
		 
			panel_MemoriaRam.setBounds(12, 55, 554, 213);
			contentPanel.add(panel_MemoriaRam);
			contentPanel.setLayout(null);
			setLocationRelativeTo(null);
			panel_MemoriaRam.setLayout(null);
			
			JLabel lblCantidadDeAlmacenamiento = new JLabel("Cantidad de Almacenamiento:");
			lblCantidadDeAlmacenamiento.setBounds(12, 31, 219, 15);
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
			lblMemoriaRam.setFont(new Font("Dialog", Font.BOLD, 14));
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
			tglbtnAtrsMR.setBounds(12, 180, 104, 25);
			panel_MemoriaRam.add(tglbtnAtrsMR);
			
			
			tglbtnSiguiente3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
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
			tglbtnSiguiente3.setBounds(412, 180, 130, 25);
			panel_MemoriaRam.add(tglbtnSiguiente3);
		
		
		
		
		
		
		//Panel para pedir Tipo de Almacenamiento del Disco Duro
		
	
		panel_DiscoDuro.setBounds(12, 52, 554, 183);
		contentPanel.add(panel_DiscoDuro);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		panel_DiscoDuro.setLayout(null);

		{
			JLabel lblDiscoDuro = new JLabel("Disco Duro");
			lblDiscoDuro.setFont(new Font("Dialog", Font.BOLD, 14));
			lblDiscoDuro.setBounds(221, 6, 104, 15);
			panel_DiscoDuro.add(lblDiscoDuro);
			JLabel lblAlmacenamiento = new JLabel("Almacenamiento: ");
			lblAlmacenamiento.setBounds(12, 34, 137, 15);
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
			rdbtnGbDD.setBounds(12, 61, 149, 23);
			panel_DiscoDuro.add(rdbtnGbDD);
			
			
			rdbtnTbDD.setBounds(12, 102, 149, 23);
			
			panel_DiscoDuro.add(rdbtnTbDD);
			JToggleButton tglbtnAtrsDD = new JToggleButton("Atrás");
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
			tglbtnAtrsDD.setBounds(12, 146, 82, 25);
				panel_DiscoDuro.add(tglbtnAtrsDD);
				
			JToggleButton tglbtnSiguiente1 = new JToggleButton("Siguiente");
			tglbtnSiguiente1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
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
			
			tglbtnSiguiente1.setBounds(424, 146, 118, 25);
			panel_DiscoDuro.add(tglbtnSiguiente1);
		
		
		
		// Panel para pedir el tipo de conexión del Disco Duro
		
		panel_ConexionDiscoDuro.setBounds(12, 52, 554, 171);
		contentPanel.add(panel_ConexionDiscoDuro);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		panel_ConexionDiscoDuro.setLayout(null);

		
		
			JLabel lblAlmacenamiento = new JLabel("Tipo de conexión:");
			lblAlmacenamiento.setBounds(12, 39, 137, 15);
			panel_ConexionDiscoDuro.add(lblAlmacenamiento);
		
				rdbtnIDEDD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnIDEDD.setSelected(true);
					rdbtnSataDD.setSelected(false);
					rdbtnSata2DD.setSelected(false);
					rdbtnSata3DD.setSelected(false);
				}
			});
			rdbtnIDEDD.setBounds(12, 62, 149, 23);
			panel_ConexionDiscoDuro.add(rdbtnIDEDD);
		
		
			
			rdbtnSataDD.setBounds(397, 62, 149, 23);
			panel_ConexionDiscoDuro.add(rdbtnSataDD);
			rdbtnSataDD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnIDEDD.setSelected(false);
					rdbtnSataDD.setSelected(true);
					rdbtnSata2DD.setSelected(false);
					rdbtnSata3DD.setSelected(false);
				}
			});
		
			rdbtnSata2DD.setBounds(12, 89, 149, 23);
			panel_ConexionDiscoDuro.add(rdbtnSata2DD);
			rdbtnSata2DD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnIDEDD.setSelected(false);
					rdbtnSataDD.setSelected(false);
					rdbtnSata2DD.setSelected(true);
					rdbtnSata3DD.setSelected(false);
				}
			});
		
			rdbtnSata3DD.setBounds(397, 89, 149, 23);
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
			tglbtnAtrsDD2.setBounds(12, 134, 82, 25);
			panel_ConexionDiscoDuro.add(tglbtnAtrsDD2);
			
			JToggleButton tglbtnSiguienteDD2 = new JToggleButton("Siguiente");
			tglbtnSiguienteDD2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
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
			tglbtnSiguienteDD2.setBounds(424, 134, 118, 25);
			panel_ConexionDiscoDuro.add(tglbtnSiguienteDD2);
		
		
			JLabel lblDiscoDuro = new JLabel("Disco Duro");
			lblDiscoDuro.setFont(new Font("Dialog", Font.BOLD, 14));
			lblDiscoDuro.setBounds(223, 8, 105, 15);
			panel_ConexionDiscoDuro.add(lblDiscoDuro);
		
	
		//Panel para elegir los productos con las caracteristicas elegidas
		
		
		panel_ProductSelected.setBounds(12, 44, 554, 169);
		contentPanel.add(panel_ProductSelected);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		panel_ProductSelected.setLayout(null);
		{
			txtVariables = new JTextField();
			txtVariables.setEditable(false);
			txtVariables.setText("Variables");
			txtVariables.setBounds(0, 20, 542, 19);
			panel_ProductSelected.add(txtVariables);
			txtVariables.setColumns(10);
		}
		
		JLabel lblProductosQueCumplen = new JLabel("Productos que cumplen con las características:");
		lblProductosQueCumplen.setBounds(5, 5, 367, 15);
		panel_ProductSelected.add(lblProductosQueCumplen);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"#", "Marca", "Modelo", "Almacenamiento", "Precio"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table_2.setBounds(0, 42, 542, 120);
		panel_ProductSelected.add(table_2);
		
		panel_ProductSelected.setBounds(12, 44, 554, 220);
		contentPanel.add(panel_ProductSelected);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		panel_ProductSelected.setLayout(null);
		{
			txtVariables = new JTextField();
			txtVariables.setEditable(false);
			txtVariables.setText("Variables");
			txtVariables.setBounds(0, 20, 542, 19);
			panel_ProductSelected.add(txtVariables);
			txtVariables.setColumns(10);
		}
		
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
				
			}
		});
		tglbtnAtrsPS.setBounds(0, 195, 93, 25);
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
				
			}
		});
		tglbtnVerCarrito.setBounds(166, 195, 167, 25);
		panel_ProductSelected.add(tglbtnVerCarrito);
		
		JToggleButton tglbtnAgregarAlCarrito = new JToggleButton("Agregar al Carrito");
		tglbtnAgregarAlCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Agregar el producto al carrito
				
			}
		});
		tglbtnAgregarAlCarrito.setBounds(375, 195, 167, 25);
		panel_ProductSelected.add(tglbtnAgregarAlCarrito);
		
		/* 
		 //Panel Carrito de compras
		  
		 {

			panel_CarritoCompras.setBounds(12, 44, 554, 212);
			contentPanel.add(panel_CarritoCompras);
			contentPanel.setLayout(null);
			setLocationRelativeTo(null);
			panel_CarritoCompras.setLayout(null);
			{
				JLabel lblCarritoDeCompras = new JLabel("Carrito de Compras");
				lblCarritoDeCompras.setFont(new Font("Dialog", Font.BOLD, 14));
				lblCarritoDeCompras.setBounds(189, 5, 163, 15);
				panel_CarritoCompras.add(lblCarritoDeCompras);
			}
			{
				table_3 = new JTable();
				table_3.setModel(new DefaultTableModel(
					new Object[][] {
						{"#", "Producto", "Marca", "Modelo", "Cantidad", "Precio"},
					},
					new String[] {
						"New column", "New column", "New column", "New column", "New column", "New column"
					}
				));
				table_3.setBounds(10, 25, 532, 110);
				panel_CarritoCompras.add(table_3);
			}
			{
				JToggleButton tglbtnVolverAComprar = new JToggleButton("Volver a Comprar");
				tglbtnVolverAComprar.setBounds(12, 175, 167, 25);
				panel_CarritoCompras.add(tglbtnVolverAComprar);
			}
			{
				JToggleButton tglbtnRealizarCompra = new JToggleButton("Realizar Compra");
				tglbtnRealizarCompra.setBounds(375, 175, 167, 25);
				panel_CarritoCompras.add(tglbtnRealizarCompra);
			}
			{
				JLabel lblTotalAPagar = new JLabel("Total a pagar: ");
				lblTotalAPagar.setBounds(174, 146, 104, 15);
				panel_CarritoCompras.add(lblTotalAPagar);
			}
			{
				CostoTotal = new JTextField();
				CostoTotal.setEditable(false);
				CostoTotal.setBounds(281, 144, 115, 19);
				panel_CarritoCompras.add(CostoTotal);
				CostoTotal.setColumns(10);
			}
		}
	
		 */
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
