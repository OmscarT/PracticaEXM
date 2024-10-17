import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import libAreas.areas;
public class AREAS2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AREAS2 frame = new AREAS2();
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
	public AREAS2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Calculo Circulo ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				areas objAreas = new areas();
				float area = objAreas.circulo(20F);
				JOptionPane.showMessageDialog(btnNewButton, "el area es = " +area);
				
				
				
			}
		});
		btnNewButton.setBounds(10, 27, 212, 40);
		contentPane.add(btnNewButton);
		
		JButton btnCalculo = new JButton("Calculo Triangulo");
		btnCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				areas objtAreasT = new areas();
				float areasT=objtAreasT.triangulo(20F,40F);
				JOptionPane.showMessageDialog(btnNewButton, "el area es = " +areasT);
			}
		});
		btnCalculo.setBounds(81, 85, 212, 40);
		contentPane.add(btnCalculo);
		
		JButton btnCalculoRectangulo = new JButton("Calculo Rectangulo");
		btnCalculoRectangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				areas objtAreasR = new areas();
				float areasR=objtAreasR.rectangulo(20F,40F);
				JOptionPane.showMessageDialog(btnNewButton, "el area es = " +areasR);
				
				
				
			}
			
		});
		btnCalculoRectangulo.setBounds(140, 152, 212, 40);
		contentPane.add(btnCalculoRectangulo);
	}

}
