package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class ProyectoSwingPropio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProyectoSwingPropio window = new ProyectoSwingPropio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProyectoSwingPropio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 782, 526);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
