package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame {
	
	public void criarFrame() {
		
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setTitle("Tabuada");
		frame.setSize(500, 500);
		frame.setLayout(null);
		
		Font fonteTitulo = new Font("Lucida Sans", Font.BOLD, 24);
		Color corTitulo = new Color(20, 53, 209);
		
		JLabel lblTitulo = new JLabel();
		lblTitulo.setText("Tabuada");
		lblTitulo.setFont(fonteTitulo);
		lblTitulo.setForeground(corTitulo);
		lblTitulo.setBounds(40, 20, 130, 30);
		
		Font fonteMM = new Font("Arial", Font.PLAIN, 18);
		
		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando:");
		lblMultiplicando.setBounds(95, 80, 120, 30);
		lblMultiplicando.setFont(fonteMM);
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(230, 80, 60, 30);
		
		JLabel lblMultiplicador = new JLabel();
		lblMultiplicador.setText("Máximo multiplicador:");
		lblMultiplicador.setBounds(40, 125, 175, 30);
		lblMultiplicador.setFont(fonteMM);
		
		JTextField txtMultiplicador = new JTextField();
		txtMultiplicador.setBounds(230, 125, 60, 30);
		
		Font fonteBtnCalculo = new Font("Candara", Font.BOLD, 18);
		Color corBtnCalculo = new Color(133, 244, 100);
		
		JButton btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(40, 185, 245, 50);
		btnCalcular.setBackground(corBtnCalculo);
		btnCalcular.setFont(fonteBtnCalculo);
		btnCalcular.setForeground(Color.WHITE);
			
		frame.getContentPane().add(lblTitulo);
		frame.getContentPane().add(lblMultiplicando);
		frame.getContentPane().add(txtMultiplicando);
		frame.getContentPane().add(lblMultiplicador);
		frame.getContentPane().add(txtMultiplicador);
		frame.getContentPane().add(btnCalcular);
		
		frame.setVisible(true);
		
	}
}
