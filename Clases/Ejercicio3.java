package Clases;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.event.ActionEvent;


public class Ejercicio3 extends JFrame{
	
	private JPanel contentPane;
	private JRadioButton btnWindows;
	private JRadioButton btnLinux;
	private JRadioButton btnMac;
	private JSlider slider;
	/**
	 * Launch the application.
	 */
	public void run() {
		try {
			Ejercicio3 frame = new Ejercicio3();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 252, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnWindows = new JRadioButton("Windows");
		btnWindows.setBounds(20, 57, 200, 23);
		getContentPane().add(btnWindows);
		
		btnLinux = new JRadioButton("Linux");
		btnLinux.setBounds(20, 93, 200, 23);
		getContentPane().add(btnLinux);
		
		btnMac = new JRadioButton("Mac");
		btnMac.setBounds(20, 132, 200, 23);
		getContentPane().add(btnMac);
		
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(btnWindows);
		grupo1.add(btnLinux);
		grupo1.add(btnMac);
		
		JCheckBox chkProgramacion = new JCheckBox("Programaci\u00F3n");
		chkProgramacion.setBounds(20, 209, 200, 23);
		getContentPane().add(chkProgramacion);
		
		JCheckBox chkDiseño = new JCheckBox("Dise\u00F1o");
		chkDiseño.setBounds(20, 249, 200, 23);
		getContentPane().add(chkDiseño);
		
		JCheckBox chkAdministracion = new JCheckBox("Administraci\u00F3n");
		chkAdministracion.setBounds(20, 287, 200, 23);
		getContentPane().add(chkAdministracion);
		
		slider = new JSlider();
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setValue(5);
		slider.setMaximum(10);
		slider.setBounds(20, 412, 200, 26);
		getContentPane().add(slider);
		
		JLabel lblNewLabel = new JLabel("Horas en el ordenador");
		lblNewLabel.setBounds(20, 370, 200, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(20, 449, 28, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("10");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(192, 449, 28, 14);
		getContentPane().add(lblNewLabel_2);
		
		JButton boton = new JButton("Enviar encuesta");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado();
			}
		});
		boton.setBounds(20, 474, 200, 23);
		contentPane.add(boton);
		
		JLabel lblNewLabel_1_1 = new JLabel("5");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(106, 449, 28, 14);
		contentPane.add(lblNewLabel_1_1);
	}
	
	public void resultado() {
		String output = "";
		Component[] componentes = contentPane.getComponents();
		for(int i=0;i<componentes.length;i++) {
			if(componentes[i] instanceof JCheckBox && ((AbstractButton) componentes[i]).isSelected()) {
				JCheckBox bot = (JCheckBox)componentes[i];
				output += bot.getText() + "\n";
			} else if (componentes[i] instanceof JRadioButton && ((AbstractButton) componentes[i]).isSelected()) {
				JRadioButton bot = (JRadioButton)componentes[i];
				output += bot.getText() + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, output + "Horas en el ordenador: " + slider.getValue());
	}
}
