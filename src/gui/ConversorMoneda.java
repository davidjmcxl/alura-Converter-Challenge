package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import conversores.ConvertCurrency;
import conversores.ConvertToPeso;
import main.Menu;
import javax.swing.JSplitPane;
import javax.swing.JMenu;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConversorMoneda extends JFrame implements ActionListener {

	private JPanel contentPane;
	private ButtonGroup bg = new ButtonGroup();
	private JComboBox<String> comboBox, comboBox2;
	JRadioButton rdbtn1, rdbtn2;
	JButton btnCalcule;
	private JTextField valueIn;
	private JTextField resultOut;
	private int opc,opc2;
	private int state;
	private String current = "";
	private JButton btnRegresar;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ConversorMoneda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 517);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Conversores Alura Moneda");
		setLocationRelativeTo(null);

		JLabel lbltitle = new JLabel("Conversor De Moneda");
		lbltitle.setForeground(new Color(0, 0, 128));
		lbltitle.setFont(new Font("Tahoma", Font.BOLD, 28));
		lbltitle.setBounds(150, 10, 366, 93);
		contentPane.add(lbltitle);

		JLabel lblselector = new JLabel("Seleccione que tipo de conversion desea realizar");
		lblselector.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblselector.setBounds(45, 102, 471, 21);
		contentPane.add(lblselector);

		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String opcion = comboBox.getSelectedItem().toString();
				String[] index = opcion.split("-");

				opc = Integer.parseInt(index[0]);

				current = index[2];

			}
		});

		comboBox.setBounds(20, 212, 275, 21);
		contentPane.add(comboBox);
		String opciones[];
		Menu menu = new Menu();
		opciones = menu.Getmenu();
		for (String i : opciones) {
			comboBox.addItem(i);
		}
		;
		rdbtn1 = new JRadioButton("Convertir de peso a moneda ");
		rdbtn1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				comboBox.setEnabled(true);
				comboBox2.setEnabled(false);
				state=0;
			}
		});

		rdbtn1.setSelected(true);
		rdbtn1.setBackground(new Color(192, 192, 192));
		rdbtn1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		rdbtn1.setBounds(20, 155, 302, 21);
		contentPane.add(rdbtn1);
		bg.add(rdbtn1);
		rdbtn2 = new JRadioButton("Convertir de Moneda a Peso");
		rdbtn2.setBackground(new Color(192, 192, 192));
		rdbtn2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		rdbtn2.setBounds(348, 155, 267, 21);
		contentPane.add(rdbtn2);
		bg.add(rdbtn2);

		comboBox2 = new JComboBox();
		comboBox2.setEnabled(false);
		comboBox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String opcion = comboBox2.getSelectedItem().toString();
				String[] index = opcion.split("-");

				opc2 = Integer.parseInt(index[0]);

			}
		});
		rdbtn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				comboBox.setEnabled(false);
				comboBox2.setEnabled(true);
				state=1;
			}
		});

		comboBox2.setBounds(348, 212, 275, 21);
		contentPane.add(comboBox2);

		JLabel lblNewLabel = new JLabel("Igrese el valor a Convertir");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(0, 0, 64));
		lblNewLabel.setBounds(111, 267, 194, 21);
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
		String opciones2[];
		Menu menu2 = new Menu();
		opciones2 = menu2.Getmenu2();
		for (String i : opciones2) {
			comboBox2.addItem(i);
		}
		;

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
		// TODO Auto-generated method stub
		if (btnCalcule == e.getSource()) {
			if(state==0) {
			double valueC = Double.parseDouble(valueIn.getText());
			ConvertCurrency currency = new ConvertCurrency(valueC);
			double resultConvert = currency.convertToCurrencies(opc);
			String result = String.format("%.3f", resultConvert);
			resultOut.setText(" " + result + " " + current);}
			else if(state==1) {
				double valueC = Double.parseDouble(valueIn.getText());
				ConvertToPeso currency = new ConvertToPeso(valueC);
				double resultConvert = currency.convertToPeso(opc2);
				String result = String.valueOf( resultConvert);
				resultOut.setText(" " + result + " Pesos");}
			}
		
		
			else if (btnRegresar == e.getSource()) {
			Conversor ventanaConversor = new Conversor();
			this.setVisible(false);
			ventanaConversor.setVisible(true);

		}

	}
}
