package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Conversor extends JFrame implements ActionListener {

	private JPanel contentPane;
	private ButtonGroup bg = new ButtonGroup();
	JButton btnNext;
	JButton btnCancelar ;
	JRadioButton rdbtn1 ,rdbtn2;
	/**
	 * Launch the application.


	/**
	 * Create the frame.
	 */
	public Conversor() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 517);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Conversores Alura");
		setLocationRelativeTo(null);
		
		JLabel lbltitle = new JLabel("Conversor App");
		lbltitle.setForeground(new Color(0, 0, 128));
		lbltitle.setFont(new Font("Tahoma", Font.BOLD, 28));
		lbltitle.setBounds(229, 10, 256, 93);
		contentPane.add(lbltitle);
		
		rdbtn1 = new JRadioButton("Conversor de Moneda");
		rdbtn1.setSelected(true);
		rdbtn1.setBackground(new Color(192, 192, 192));
		rdbtn1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		rdbtn1.setBounds(349, 189, 267, 21);
		contentPane.add(rdbtn1);
		bg.add(rdbtn1);
		JLabel lblselector = new JLabel("Seleccione el conversor que desea usar :");
		lblselector.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblselector.setBounds(45, 102, 366, 21);
		contentPane.add(lblselector);
		
	   rdbtn2 = new JRadioButton("Conversor de Temperatura");
		rdbtn2.setBackground(new Color(192, 192, 192));
		rdbtn2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		rdbtn2.setBounds(349, 246, 267, 21);
		contentPane.add(rdbtn2);
		bg.add(rdbtn2);
		
		
		btnNext = new JButton("Continuar");
		btnNext.setForeground(new Color(255, 255, 255));
		btnNext.setBackground(new Color(39, 39, 39));
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 14));
	
		btnNext.setBounds(161, 358, 138, 52);
		btnNext.addActionListener(this);
		contentPane.add(btnNext);
		
		btnCancelar = new JButton("Salir");
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setBackground(new Color(39, 39, 39));
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancelar.setBounds(337, 358, 138, 52);
		btnCancelar.addActionListener(this);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DAVID MORENO C\\Downloads\\Imagen2.jpg"));
		lblNewLabel.setBounds(160, 156, 171, 154);
		contentPane.add(lblNewLabel);
	}

	public void actionPerformed(ActionEvent e) {
	if(btnNext==e.getSource()) {
		if(rdbtn1.isSelected()) {
			this.setVisible(false);
			ConversorMoneda cvMoneda = new ConversorMoneda();
			cvMoneda.setVisible(true);
		}else if(rdbtn2.isSelected()) {
			this.setVisible(false);
			ConversorTemperatura cvTemp = new ConversorTemperatura();
			cvTemp.setVisible(true);
		}
		
	}
	else if(btnCancelar==e.getSource()) {
		this.setVisible(false);
	}
		
	}
}
