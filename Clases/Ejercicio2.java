package Clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private ArrayList<String> peliculas = new ArrayList<>();
	
	/**
	 * Launch the application.
	 */
	public void run() {
		try {
			Ejercicio2 frame = new Ejercicio2();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Escribe el nombre de una pelicula");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 26, 201, 14);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(22, 73, 171, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton boton = new JButton("A\u00F1adir");
		boton.setBounds(58, 126, 89, 23);
		contentPane.add(boton);

		JLabel lblNewLabel_1 = new JLabel("Peliculas");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(257, 26, 134, 14);
		contentPane.add(lblNewLabel_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(257, 72, 134, 22);
		contentPane.add(comboBox);

		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				peliculas.add(textField.getText());
				comboBox.setModel(new DefaultComboBoxModel(peliculas.toArray()));
			}

		};
		boton.addActionListener(al);
	}
}
