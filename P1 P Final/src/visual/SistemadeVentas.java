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


/*		Tabla para los productos
 
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Num", "Producto", "Marca", "Modelo", "Cantidad", "Precio"},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", ""
			}
		));
		
		table.setBounds(12, 193, 324, 32);
		contentPanel.add(table);
	*/	
		


		JPanel panel_DiscoDuro = new JPanel();
		JPanel panel_ConexionDiscoDuro = new JPanel();
		JPanel panel_ProductSelected = new JPanel();
		
		contentPanel.setLayout(null);
		{
			JPanel panel_CarritoCompras = new JPanel();
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
		setLocationRelativeTo(null);
	/*	
	//Panel para elegir el producto	
		JPanel panel_productoaelegir = new JPanel();
		panel_productoaelegir.setBounds(12, 52, 554, 178);
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
		
		/*
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
			//		panel_MotherBoard.setVisible(true);
			//		panel_Microprocesador.setVisible(false);
			//		panel_MemoriaRam.setVisible(false);
					panel_DiscoDuro.setVisible(false);
					panel_productoaelegir.setVisible(false);

				}
			
			}
		});
		
		tglbtnSiguiente.setBounds(424, 141, 118, 25);
		panel_productoaelegir.add(tglbtnSiguiente);
		*/
		//Panel para pedir Tipo de Almacenamiento
		
/*	
		panel_DiscoDuro.setBounds(12, 52, 554, 183);
		contentPanel.add(panel_DiscoDuro);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		panel_DiscoDuro.setLayout(null);

		{
			JLabel lblAlmacenamiento = new JLabel("Almacenamiento: ");
			lblAlmacenamiento.setBounds(12, 12, 137, 15);
			panel_DiscoDuro.add(lblAlmacenamiento);
		}
		{
			JRadioButton rdbtnGb = new JRadioButton("GB");
			rdbtnGb.setBounds(12, 46, 149, 23);
			panel_DiscoDuro.add(rdbtnGb);
		}
		{
			JRadioButton rdbtnNewRadioButton = new JRadioButton("TB");
			rdbtnNewRadioButton.setBounds(12, 84, 149, 23);
			panel_DiscoDuro.add(rdbtnNewRadioButton);
		}
		JToggleButton tglbtnSiguiente1 = new JToggleButton("Siguiente");
		tglbtnSiguiente1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	//		/*		if(rdbtnDiscoDuro.isSelected()) {
			//		panel_MotherBoard.setVisible(true);
			//		panel_Microprocesador.setVisible(false);
			//		panel_MemoriaRam.setVisible(false);
					panel_DiscoDuro.setVisible(true);
					panel_productoaelegir.setVisible(false);
					
	//		}
			}
		});
		
		tglbtnSiguiente1.setBounds(424, 146, 118, 25);
		panel_DiscoDuro.add(tglbtnSiguiente1);/	
		JToggleButton tglbtnAtrs = new JToggleButton("Atrás");
			tglbtnAtrs.setBounds(12, 146, 82, 25);
			panel_DiscoDuro.add(tglbtnAtrs);
		*/
		
		
		// Panel para pedir el tipo de conexión
	/*	
		panel_ConexionDiscoDuro.setBounds(12, 52, 554, 171);
		contentPanel.add(panel_ConexionDiscoDuro);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		panel_ConexionDiscoDuro.setLayout(null);
		{
			JLabel lblAlmacenamiento = new JLabel("Tipo de conexión:");
			lblAlmacenamiento.setBounds(12, 12, 137, 15);
			panel_ConexionDiscoDuro.add(lblAlmacenamiento);
		}
		{
			JRadioButton rdbtnGb = new JRadioButton("IDE");
			rdbtnGb.setBounds(12, 35, 149, 23);
			panel_ConexionDiscoDuro.add(rdbtnGb);
		}
		{
			JRadioButton rdbtnNewRadioButton = new JRadioButton("SATA");
			rdbtnNewRadioButton.setBounds(397, 35, 149, 23);
			panel_ConexionDiscoDuro.add(rdbtnNewRadioButton);
		}
		JToggleButton tglbtnSiguiente = new JToggleButton("Siguiente");
		tglbtnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		tglbtnSiguiente.setBounds(428, 134, 118, 25);
		panel_ConexionDiscoDuro.add(tglbtnSiguiente);
		{
			JRadioButton rdbtnSata = new JRadioButton("SATA-2");
			rdbtnSata.setBounds(12, 89, 149, 23);
			panel_ConexionDiscoDuro.add(rdbtnSata);
		}
		{
			JRadioButton rdbtnSata_1 = new JRadioButton("SATA-3");
			rdbtnSata_1.setBounds(397, 89, 149, 23);
			panel_ConexionDiscoDuro.add(rdbtnSata_1);
		}
		{
			JToggleButton tglbtnAtrs = new JToggleButton("Atrás");
			tglbtnAtrs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			tglbtnAtrs.setBounds(12, 134, 82, 25);
			panel_ConexionDiscoDuro.add(tglbtnAtrs);
		}
		
		*/
		//Panel para mostrar los productos seleccionados
		/*
		{
			
			{
				JLabel lblProductosConLas = new JLabel("Productos con las características elegidas:");
				lblProductosConLas.setBounds(12, 12, 317, 15);
				panel_ProductosSeleccionados.add(lblProductosConLas);
			}
			
			table_1 = new JTable();
			table_1.setModel(new DefaultTableModel(
				new Object[][] {
					{"Marca", "Modelo", "Almacenamiento", "Precio"},
				},
				new String[] {
					"New column", "New column", "New column", "New column"
				}
			));
			table_1.setBounds(0, 63, 542, 119);
			panel_ProductosSeleccionados.add(table_1);
			
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBounds(12, 32, 448, 19);
			panel_ProductosSeleccionados.add(textField_1);
			textField_1.setColumns(10);
		}
		*/		
		//Panel para elegir los productos
		/*
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
		
		JToggleButton tglbtnAtrs = new JToggleButton("Atrás");
		tglbtnAtrs.setBounds(0, 195, 93, 25);
		panel_ProductSelected.add(tglbtnAtrs);
		
		JToggleButton tglbtnVerCarrito = new JToggleButton("Ver Carrito");
		tglbtnVerCarrito.setBounds(166, 195, 167, 25);
		panel_ProductSelected.add(tglbtnVerCarrito);
		
		JToggleButton tglbtnAgregarAlCarrito = new JToggleButton("Agregar al Carrito");
		tglbtnAgregarAlCarrito.setBounds(375, 195, 167, 25);
		panel_ProductSelected.add(tglbtnAgregarAlCarrito);
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
