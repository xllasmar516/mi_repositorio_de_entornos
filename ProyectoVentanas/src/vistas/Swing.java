package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Color;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Choice;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;

public class Swing {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing window = new Swing();
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
	public Swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.setBounds(100, 100, 728, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		
		JLabel lblNewLabel_1 = new JLabel("Código Departamento: ");
		
		JLabel lblNewLabel_2 = new JLabel("Nombre Departamento:");
		
		JLabel lblNewLabel_3 = new JLabel("Localidad Departamento:");
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 128, 255));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Selecciona el pais:");
		
		JTextArea textArea = new JTextArea();
		
		JLabel lblNewLabel_5 = new JLabel("Tipo de departamento:");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Personal");
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Tecnológico");
		rdbtnNewRadioButton_3.setSelected(true);
		
		JButton btnNewButton = new JButton("Ver Datos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_1 = new JButton("Limpiar Datos");
		
		JButton btnNewButton_2 = new JButton("Insertar Oficina");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Españita"}));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Aplicar subida");
		chckbxNewCheckBox.setSelected(true);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Gestión");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Apoyo");
		
		JScrollBar scrollBar = new JScrollBar();
		
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setOrientation(JScrollBar.HORIZONTAL);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(91)
									.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(47)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
											.addGap(57)
											.addComponent(btnNewButton_1))
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
											.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addComponent(lblNewLabel_1)
													.addComponent(lblNewLabel_3)
													.addComponent(lblNewLabel_2))
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addComponent(textField, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
													.addComponent(textField_2, 130, 130, 130)
													.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))))
									.addGap(4)))
							.addGap(87)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_5)
								.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnNewRadioButton_2, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnNewRadioButton_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addComponent(chckbxNewCheckBox, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnNewRadioButton_3, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
							.addGap(151))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(143)
							.addComponent(btnNewButton_2))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(scrollBar_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textArea, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(33)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_3)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_5))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel_2)
												.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(rdbtnNewRadioButton)
											.addGap(24)))
									.addGap(4)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnNewRadioButton_2)
							.addGap(4)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_4))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(rdbtnNewRadioButton_3)
									.addGap(18)
									.addComponent(chckbxNewCheckBox)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton_2)
							.addGap(34))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap(118, Short.MAX_VALUE)
							.addComponent(rdbtnNewRadioButton_1)
							.addGap(175)))
					.addGap(16)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(scrollBar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textArea, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollBar_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
