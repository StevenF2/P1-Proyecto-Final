package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Combo extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Combo dialog = new Combo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Combo() {
		setLocationRelativeTo(null);
		contentPanel.setLayout(null);
		setTitle("Compre un Combo Especial");
		setBounds(100, 100, 580, 320);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		panel.setLayout(null);
		panel.setBounds(0, 0, 580, 290);
		
		JLabel lblCompreUnCombo = new JLabel("Compre Un Combo Especial");
		lblCompreUnCombo.setFont(new Font("Dialog", Font.BOLD, 16));
		lblCompreUnCombo.setBounds(141, 12, 259, 15);
		panel.add(lblCompreUnCombo);
		
		JToggleButton tglbtnComprar = new JToggleButton("Comprar 1");
		tglbtnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		tglbtnComprar.setBounds(12, 253, 106, 25);
		panel.add(tglbtnComprar);
		
		JToggleButton tglbtnComprar_1 = new JToggleButton("Comprar 2");
		tglbtnComprar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnComprar_1.setBounds(227, 253, 106, 25);
		panel.add(tglbtnComprar_1);
		
		JToggleButton tglbtnComprar_2 = new JToggleButton("Comprar 3");
		tglbtnComprar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnComprar_2.setBounds(447, 253, 106, 25);
		panel.add(tglbtnComprar_2);
		
		JTextPane txtpnCombo = new JTextPane();
		txtpnCombo.setText("Combo 1\n\n1.\n2.\n3.\n\nRD$");
		txtpnCombo.setBounds(12, 52, 121, 177);
		panel.add(txtpnCombo);
		
		JTextPane txtpnCombo_1 = new JTextPane();
		txtpnCombo_1.setText("Combo 2\n\n1.\n2.\n\nRD$");
		txtpnCombo_1.setBounds(228, 52, 121, 177);
		panel.add(txtpnCombo_1);
		
		JTextPane txtpnCombo_2 = new JTextPane();
		txtpnCombo_2.setText("Combo 3\n\n1.\n2.\n3.\n\nRD$");
		txtpnCombo_2.setBounds(428, 49, 121, 180);
		panel.add(txtpnCombo_2);
	}
}
