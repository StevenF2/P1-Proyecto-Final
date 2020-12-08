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
import logico.SATA2;
import logico.SATA3;
import logico.SATA4;
import logico.Tienda;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class RealizarOrden extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUnidades;
	private JTextField txtProveedor;
	private float cTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RealizarOrden dialog = new RealizarOrden();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RealizarOrden() {
		
		DefaultListModel proveedores = new DefaultListModel();
		DefaultListModel ordenes = new DefaultListModel();
		DefaultListModel componentes = new DefaultListModel();
		
		ArrayList <Proveedor> pro = new ArrayList<Proveedor>();
		pro.addAll(Tienda.getInstance().getProveedores());
		ArrayList <OrdenDeCompra> o = new ArrayList<OrdenDeCompra>();
		ArrayList <Componente> comp = new ArrayList<Componente>();
		o.addAll(Tienda.getInstance().getOrdenes());
		
	//	float unidades = Float.parseFloat(txtUnidades.getText());
		//float Ctotal = 0;
		
		
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Realizar Orden");
		setBounds(100, 100, 353, 490);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Orden No:");
		lblNewLabel_1.setBounds(10, 11, 94, 14);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Componentes a Ordenar:");
		lblNewLabel_2.setBounds(10, 149, 181, 14);
		contentPanel.add(lblNewLabel_2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 174, 295, 177);
		contentPanel.add(scrollPane_2);
		
		JList listaComponentes = new JList();
		scrollPane_2.setViewportView(listaComponentes);
		listaComponentes.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		listaComponentes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listaComponentes.setModel(componentes);
		
		JLabel lblNewLabel_3 = new JLabel("Numero de Unidades a ordenar:");
		lblNewLabel_3.setBounds(10, 362, 181, 14);
		contentPanel.add(lblNewLabel_3);
		
		txtUnidades = new JTextField();
		txtUnidades.setBounds(219, 359, 86, 20);
		contentPanel.add(txtUnidades);
		txtUnidades.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 36, 84, 96);
		contentPanel.add(scrollPane);
		
		JList listaOrdenes = new JList();
		scrollPane.setViewportView(listaOrdenes);
		listaOrdenes.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		listaOrdenes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listaOrdenes.setModel(ordenes);
		
		JLabel lblNewLabel = new JLabel("Proveedor:");
		lblNewLabel.setBounds(122, 69, 86, 14);
		contentPanel.add(lblNewLabel);
		
		txtProveedor = new JTextField();
		txtProveedor.setEditable(false);
		txtProveedor.setBounds(190, 66, 86, 20);
		contentPanel.add(txtProveedor);
		txtProveedor.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Seleccionar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(listaOrdenes.getSelectedIndex() >= 0) {
							comp.clear();
							componentes.clear();
							int i = listaOrdenes.getSelectedIndex();
							comp.addAll(o.get(i).getComponentes());
							float costoOrden = 0;
						//	componentes.clear();
							
							txtProveedor.setText(o.get(i).getProveedor().getNombre());
						//	float unidades = Float.parseFloat(txtUnidades.getText());
							
							for(Componente c : comp) {
								
								String tipo = "";
								String clase = "";
								String marca = "";
								String modelo = "";
								
							//	costoTotal += c.getPrecioCompra();
								
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
								
								float costo = Math.round((c.getPrecioCompra()*100)/100);
								
								componentes.addElement(tipo+"              "+clase+"                  "+"Costo Unitario ="+costo+"$RD");
								costoOrden += costo;
								
							//	clean();
														
							}
					//		txtCostoTotal.setText(""+costoOrden);
							float costoTotal = Math.round((costoOrden*100)/100);
							cTotal = costoTotal;
							
							componentes.addElement("Costo ="+cTotal+"$RD");
							
						}
						
					}
				});
				
				JButton btnNewButton = new JButton("Realizar Orden");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(listaOrdenes.getSelectedIndex() >= 0) {
							
							comp.clear();
							int i = listaOrdenes.getSelectedIndex();
							comp.addAll(o.get(i).getComponentes());
							float unidades = Float.parseFloat(txtUnidades.getText());
					//		float costoOrden = 0;
							
					//		txtProveedor.setText(o.get(i).getProveedor().getNombre());
					//		float unidades = Float.parseFloat(txtUnidades.getText());
							
							for(Componente c : comp) {
								
								int u = Math.round(unidades);
								c.setCantDisponible(c.getCantDisponible()+u);
								c.setNumSerie(Tienda.getInstance().getIdComponentes());
								
								Tienda.getInstance().IngresarComponente(c);
								
							}
							
							float costo = cTotal*unidades;
							Tienda.getInstance().setGastos(Tienda.getInstance().getGastos()+costo);
							
							JOptionPane.showMessageDialog(null, "La orden se ha realizado exitosamente y tuvo un costo de "+costo+"$RD", "Aviso", JOptionPane.INFORMATION_MESSAGE);
							
							componentes.clear();
								
						}	
						
					}
				});
				buttonPane.add(btnNewButton);
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
		
		
		
			o.addAll(Tienda.getInstance().getOrdenes());
			int j = o.size();
			int k = 1;
			
			while(k < j) {
				
				ordenes.addElement(k);
				k++;
				
			} 
			
		
	/*	if(listaProveedores.getSelectedIndex() >= 0) {
			int i = listaProveedores.getSelectedIndex();
			
			Proveedor x = null;
			x = Tienda.getInstance().getProveedores().get(i);
			o.addAll(x.getOrdenes());
			int j = o.size();
			int k = 1;
			
			while(k <= j) {
				
				ordenes.addElement(k);
				k++;
				
			} 
			
			
			
			
		 */
		
		
		
		
		
	}
}
