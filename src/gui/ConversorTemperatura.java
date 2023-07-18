package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;

public class ConversorTemperatura extends JFrame {

	private JPanel contentPane;

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
		
		
		JLabel lblselector = new JLabel("Seleccione el conversor que desea usar :");
		lblselector.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblselector.setBounds(45, 102, 366, 21);
		contentPane.add(lblselector);
		
	

		
	}
}
