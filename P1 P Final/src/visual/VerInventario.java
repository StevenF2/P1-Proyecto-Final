package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
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
import logico.SATA2;
import logico.SATA3;
import logico.SATA4;
import logico.Tienda;

import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;

public class VerInventario extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VerInventario dialog = new VerInventario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VerInventario() {
		
		ArrayList<Componente> comp = Tienda.getInstance().getComponentes();
		DefaultListModel DLM = new DefaultListModel();
		
		
		
		setTitle("Inventario");
		setResizable(false);
		setBounds(100, 100, 525, 393);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 53, 499, 240);
			contentPanel.add(scrollPane);
			{
				JList list = new JList();
				scrollPane.setViewportView(list);
				list.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				list.setModel(DLM);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
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
			float venta = Math.round((c.getPrecioVenta()*100)/100);
			
			DLM.addElement("ID: "+c.getNumSerie()+"     "+tipo+"              "+clase+"                  "+"Costo Unitario ="+costo+"$RD"+"          "+"Precio Unitario ="+venta+"$RD"+"          "+"Disponibles: "+c.getCantDisponible());
		//	DLM.addElement(comp.size());
			
			
		}
		
		
		
	}

}
