package br.sp.senai.jandira.tabuada.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaTabuada {
	
	public void criartela() {
		
		JFrame tela = new JFrame();
		tela.setSize(500, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Tabuada");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		
		
		
		//criar um label para inserir no JFRame
		//multiplicando
		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando:");
		lblMultiplicando.setBounds(20, 10, 150, 30);
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(180, 10, 50, 30);
		
		//Mínimo multiplicador
		JLabel lblMinimoMultiplicador = new JLabel();
		lblMinimoMultiplicador.setText("Minimo Multiplicador:");
		lblMinimoMultiplicador.setBounds(20, 50, 150, 30);
		
		JTextField txtMinimoMultiplicador = new JTextField();
		txtMinimoMultiplicador.setBounds(180, 50, 50, 30);
		
		JLabel lblMaximoMultiplicador = new JLabel();
		lblMaximoMultiplicador.setText("Maximo Multiplicador");
		lblMaximoMultiplicador.setBounds(20, 70, 150, 30);
		
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		
		
		tela.getContentPane().add(lblMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(lblMinimoMultiplicador);
		tela.getContentPane().add(txtMinimoMultiplicador);
		tela.getContentPane().add(lblMaximoMultiplicador);
		tela.setVisible(true);
		
		
	}
	
}
