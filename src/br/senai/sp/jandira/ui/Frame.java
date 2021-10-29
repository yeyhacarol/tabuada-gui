package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.senai.sp.jandira.model.Tabuada;

public class Frame {
	
	public void criarFrame() {
		
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setTitle("Tabuada");
		frame.setSize(600, 420);
		frame.setLayout(null);
		frame.setBackground(Color.GRAY);
		
		JPanel header = new JPanel();
		header.setBounds(0, 0, 600, 60);
		header.setBackground(Color.WHITE);
		header.setLayout(null);
		
		Font fonteTitulo = new Font("Lucida Sans", Font.BOLD, 24);
		Color corTitulo = new Color(20, 53, 209);
		
		JLabel lblTitulo = new JLabel("Tabuada");
		lblTitulo.setFont(fonteTitulo);
		lblTitulo.setForeground(corTitulo);
		lblTitulo.setBounds(40, 20, 130, 30); 
		
		Font fonteMM = new Font("Arial", Font.PLAIN, 18);
		
		JLabel lblMultiplicando = new JLabel("Multiplicando:");
		lblMultiplicando.setBounds(40, 80, 175, 30);
		lblMultiplicando.setFont(fonteMM);
		lblMultiplicando.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(230, 80, 60, 30);
		
		JLabel lblMultiplicador = new JLabel("Máximo multiplicador:");
		lblMultiplicador.setBounds(40, 125, 175, 30);
		lblMultiplicador.setFont(fonteMM);
		lblMultiplicador.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JTextField txtMultiplicador = new JTextField();
		txtMultiplicador.setBounds(230, 125, 60, 30);
		
		Font fonteBtn = new Font("Arial, sans-serif", Font.BOLD, 22);
		Color corBtnCalculo = new Color(57, 120, 53);
		
		JButton btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(40, 185, 245, 50);
		btnCalcular.setBackground(corBtnCalculo);
		btnCalcular.setFont(fonteBtn);
		btnCalcular.setForeground(Color.WHITE);
		
		Color corBtnLimpar =  new Color(150, 47, 47);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(40, 250, 245, 50);
		btnLimpar.setBackground(corBtnLimpar);
		btnLimpar.setFont(fonteBtn);
		btnLimpar.setForeground(Color.WHITE);
		
		Font fonteResultados = new Font("Arial", Font.BOLD, 18);
		
		JLabel lblResultados = new JLabel("Resultado:");
		lblResultados.setBounds(340, 80, 100, 30);
		lblResultados.setFont(fonteResultados);
		lblResultados.setForeground(corTitulo);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(340, 120, 200, 200);
			
		JList tabuadaList = new JList();
		scroll.getViewport().add(tabuadaList);
		
		DefaultListModel tabuadaModel = new DefaultListModel();	
		tabuadaList.setModel(tabuadaModel);
		
		frame.getContentPane().add(header);
		header.add(lblTitulo);
		frame.getContentPane().add(lblMultiplicando);
		frame.getContentPane().add(txtMultiplicando);
		frame.getContentPane().add(lblMultiplicador);
		frame.getContentPane().add(txtMultiplicador);
		frame.getContentPane().add(btnCalcular);
		frame.getContentPane().add(btnLimpar);
		
		frame.getContentPane().add(lblResultados);
		frame.getContentPane().add(scroll);
		
		frame.setVisible(true);
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Tabuada tabuada = new Tabuada();
				
				tabuada.setMultiplicando(txtMultiplicando.getText());
				tabuada.setMultiplicador(txtMultiplicador.getText());
				
				String[] resultadoTabuada = tabuada.calcular();
				
				for (int i = 0; i < resultadoTabuada.length; i++) {
					tabuadaModel.addElement(resultadoTabuada[i]);
				}
				
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				txtMultiplicador.setText("");
				txtMultiplicando.setText("");
				txtMultiplicando.requestFocus();
				
				tabuadaModel.removeAllElements();
				
			}
		});
		
	}
}
