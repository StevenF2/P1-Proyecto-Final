package visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.Tienda;

import javax.swing.BoxLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazPrincipal extends JFrame {

	private Dimension dim;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazPrincipal frame = new InterfazPrincipal();
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
	public InterfazPrincipal() {
		setTitle("Management Software");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 429);
		setResizable(false);
		dim = getToolkit().getScreenSize();
		super.setSize(dim.width, dim.height-45);
		setLocationRelativeTo(null);
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Empleados");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Nuevo Empleado");
		mnNewMenu.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Ver Empleados Activos");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("Inventario");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Ver Inventario");
		mnNewMenu_2.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_5 = new JMenu("Combos");
		mnNewMenu_2.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Nuevo Combo");
		mnNewMenu_5.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Ver Combos Disponibles");
		mnNewMenu_5.add(mntmNewMenuItem_9);
		
		JMenu mnNewMenu_1 = new JMenu("Ventas");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Historial de Ventas");
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Realizar Venta");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SistemadeVentas s = new SistemadeVentas();
				s.setVisible(true);
				s.setLocationRelativeTo(null);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_3 = new JMenu("Proveedores");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Nuevo Proveedor");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NuevoProveedor p = new NuevoProveedor();
				p.setVisible(true);
				p.setLocationRelativeTo(null);
				
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Ver Proveedores Activos");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Tienda.getInstance().getProveedores().size() == 0) {
					
					
					
				}else {
					
				VerProveedores v = new VerProveedores();
				v.setVisible(true);
				v.setLocationRelativeTo(null);
				
				}
			}
		});
		
		JMenu mnNewMenu_4 = new JMenu("Ordenes de Compra");
		mnNewMenu_3.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Historial de Ordenes");
		mnNewMenu_4.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Nueva Orden");
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NuevaOrden n = new NuevaOrden();
				n.setVisible(true);
				n.setLocationRelativeTo(null);
				
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Realizar Orden de Compra");
		mnNewMenu_4.add(mntmNewMenuItem_5);
		mnNewMenu_3.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
	}

}
