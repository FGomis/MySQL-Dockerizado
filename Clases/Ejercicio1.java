package Clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public void run() {
		try {
			Ejercicio1 frame = new Ejercicio1();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel etiqueta = new JLabel("Escribe un nombre para saludar");
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setBounds(88, 67, 247, 14);
		contentPane.add(etiqueta);

		textField = new JTextField();
		textField.setBounds(88, 109, 247, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton boton = new JButton("\u00A1Saludar!");
		boton.setBounds(163, 193, 89, 23);
		contentPane.add(boton);

		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, textField.getText());
			}

		};
		boton.addActionListener(al);
	}

}
