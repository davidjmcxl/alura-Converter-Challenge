package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import conversores.ConvertCurrency;
import conversores.ConvertTemp;
import conversores.ConvertToPeso;

import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ConversorTemperatura extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField valueIn,resultOut;
	private ButtonGroup bg = new ButtonGroup();
	private  JButton btnCalcule ,btnRegresar;
	private int state=0;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public ConversorTemperatura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 517);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Conversores Alura Temperatura");
		setLocationRelativeTo(null);
		
		JLabel lbltitle = new JLabel("Conversor De Temperatura");
		lbltitle.setForeground(new Color(0, 0, 128));
		lbltitle.setFont(new Font("Tahoma", Font.BOLD, 28));
		lbltitle.setBounds(150, 10, 411, 93);
		contentPane.add(lbltitle);
		
		
		JLabel lblselector = new JLabel("Seleccione que tipo de convercion desea realizar:");
		lblselector.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblselector.setBounds(45, 102, 504, 21);
		contentPane.add(lblselector);
		
		JRadioButton rdbtnConvertToCelsius = new JRadioButton("Convertir de grados  Fahrenheit a  Celsius ");
		rdbtnConvertToCelsius.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				state=0;
			}
		});
	
		rdbtnConvertToCelsius.setSelected(true);
		rdbtnConvertToCelsius.setFont(new Font("Tahoma", Font.PLAIN, 19));
		rdbtnConvertToCelsius.setBackground(Color.LIGHT_GRAY);
		rdbtnConvertToCelsius.setBounds(247, 145, 411, 21);
		contentPane.add(rdbtnConvertToCelsius);
		bg.add(rdbtnConvertToCelsius);
		JRadioButton rdbtnConvertToFare = new JRadioButton("Convertir de grados  Celsius a  Fahrenheit.  ");
		rdbtnConvertToFare.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				state=1;
			}
		});
		rdbtnConvertToFare.setSelected(true);
		rdbtnConvertToFare.setFont(new Font("Tahoma", Font.PLAIN, 19));
		rdbtnConvertToFare.setBackground(Color.LIGHT_GRAY);
		rdbtnConvertToFare.setBounds(247, 197, 411, 21);
		contentPane.add(rdbtnConvertToFare);
		bg.add(rdbtnConvertToFare);
	
		JLabel lblNewLabel = new JLabel("Igrese la temperatura a Convertir");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(0, 0, 64));
		lblNewLabel.setBounds(45, 267, 245, 21);
		contentPane.add(lblNewLabel);

		valueIn = new JTextField();
		valueIn.setBounds(20, 298, 270, 30);
		contentPane.add(valueIn);
		valueIn.setColumns(10);

		resultOut = new JTextField();
		resultOut.setEditable(false);
		resultOut.setColumns(10);
		resultOut.setBounds(348, 298, 267, 30);
		contentPane.add(resultOut);

		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setForeground(new Color(255, 0, 0));
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblResultado.setBounds(348, 267, 194, 21);
		contentPane.add(lblResultado);
		
		btnCalcule = new JButton("Calcular");
		btnCalcule.setForeground(new Color(255, 255, 255));
		btnCalcule.setBackground(new Color(39, 39, 39));
		btnCalcule.setFont(new Font("Tahoma", Font.PLAIN, 14));

		btnCalcule.setBounds(161, 358, 138, 52);
		btnCalcule.addActionListener(this);
		contentPane.add(btnCalcule);

		btnRegresar = new JButton("Regresar");
		btnRegresar.setForeground(Color.WHITE);
		btnRegresar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRegresar.setBackground(new Color(39, 39, 39));
		btnRegresar.setBounds(348, 358, 138, 52);
		btnRegresar.addActionListener(this);
		contentPane.add(btnRegresar);
	}
	public void actionPerformed(ActionEvent e) {
	
		if (btnCalcule == e.getSource()) {
			if(state==0) {
			double valueC = Double.parseDouble(valueIn.getText());
			ConvertTemp tempF = new ConvertTemp(valueC);
			double resultConvert = tempF.convertToCelsius();
			String result = String.format("%.3f", resultConvert);
			resultOut.setText(" " + result + " °C");}
			else if(state==1) {
				double valueC = Double.parseDouble(valueIn.getText());
				ConvertTemp tempC = new ConvertTemp(valueC);
				double resultConvert = tempC.convertToFarenheit();
				String result = String.valueOf( resultConvert);
				resultOut.setText(" " + result + " °F");}
			}
		
		
			else if (btnRegresar == e.getSource()) {
			Conversor ventanaConversor = new Conversor();
			this.setVisible(false);
			ventanaConversor.setVisible(true);

		}
	}
}
