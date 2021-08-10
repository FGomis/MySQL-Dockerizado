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
import java.awt.event.WindowEvent;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;


public class Ejercicio4 extends JFrame{
	
	private JPanel contentPane;
	private JTextField textFieldnum1;
	private JTextField textFieldOperador;
	private JTextField textFieldnum2;
	private JPanel panel_1;
	private JButton igual;
	private JButton suma;
	private JButton resta;
	private JButton multiplicacion;
	private JButton division;
	private JLabel num1;
	private JLabel operador;
	private JLabel num2;
	private JButton btnsalir;
	private Ejercicio4 frame;
	/**
	 * Launch the application.
	 */
	public void run() {
		try {
			 frame = new Ejercicio4();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldnum1 = new JTextField();
		textFieldnum1.setBounds(43, 57, 125, 20);
		contentPane.add(textFieldnum1);
		textFieldnum1.setColumns(10);
		
		textFieldOperador = new JTextField();
		textFieldOperador.setBounds(43, 145, 86, 20);
		contentPane.add(textFieldOperador);
		textFieldOperador.setColumns(10);
		
		textFieldnum2 = new JTextField();
		textFieldnum2.setBounds(43, 238, 115, 20);
		contentPane.add(textFieldnum2);
		textFieldnum2.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBounds(230, 32, 96, 230);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(5, 1, 0, 0));
		
		suma = new JButton("+");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOperador(suma);
			}
		});
		panel_1.add(suma);
		
		resta = new JButton("-");
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOperador(resta);
			}
		});
		panel_1.add(resta);
		
		multiplicacion = new JButton("*");
		multiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOperador(multiplicacion);
			}
		});
		panel_1.add(multiplicacion);
		
		division = new JButton("/");
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOperador(division);
			}
		});
		panel_1.add(division);
		
		igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operar();
			}
		});
		panel_1.add(igual);
		
		num1 = new JLabel("N\u00FAmero 1");
		num1.setHorizontalAlignment(SwingConstants.LEFT);
		num1.setBounds(43, 32, 125, 14);
		contentPane.add(num1);
		
		operador = new JLabel("Operador");
		operador.setHorizontalAlignment(SwingConstants.LEFT);
		operador.setBounds(43, 120, 86, 14);
		contentPane.add(operador);
		
		num2 = new JLabel("N\u00FAmero 2");
		num2.setHorizontalAlignment(SwingConstants.LEFT);
		num2.setBounds(43, 213, 115, 14);
		contentPane.add(num2);
		
		btnsalir = new JButton("Salir");
		btnsalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnsalir.setBounds(131, 308, 89, 23);
		contentPane.add(btnsalir);
	}
	
	public void setOperador(JButton boton) {
		textFieldOperador.setText(boton.getText());
	}
	
	public void operar() {
		double resultado = 0;
		switch (textFieldOperador.getText()) {
		case "+":
			resultado = Double.parseDouble(textFieldnum1.getText()) + Double.parseDouble(textFieldnum2.getText());
			break;
		case "-":
			resultado = Double.parseDouble(textFieldnum1.getText()) - Double.parseDouble(textFieldnum2.getText());
			break;
		case "*":
			resultado = Double.parseDouble(textFieldnum1.getText()) * Double.parseDouble(textFieldnum2.getText());
			break;
		case "/":
			resultado = Double.parseDouble(textFieldnum1.getText()) / Double.parseDouble(textFieldnum2.getText());
			break;
		}
		JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
	}
}
