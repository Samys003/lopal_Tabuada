package br.sp.senai.jandira.tabuada.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import br.sp.senai.jandira.tabuada.model.Tabuada;

public class TelaTabuada {

	private JLabel lblMultiplicando;
	private JTextField txtMultiplicando;
	private JLabel lblMinimoMultiplicador;
	private JTextField txtMaximoMultiplicador;
	private JLabel lblMaximoMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	
	
	
	public void criartela() {
		
		JFrame tela = new JFrame();
		tela.setSize(265, 550);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Tabuada");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setResizable(false);
		
		
		
		//criar um label para inserir no JFRame
		//multiplicando
		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando:");
		lblMultiplicando.setBounds(20, 10, 150, 30);
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(180, 10, 50, 30);
		
		//Mínimo multiplicador
		JLabel lblMinimoMultiplicador = new JLabel();
		lblMinimoMultiplicador.setText("Mínimo Multiplicador: ");
		lblMinimoMultiplicador.setBounds(20, 50, 150, 30);
		
		JTextField txtMinimoMultiplicador = new JTextField();
		txtMinimoMultiplicador.setBounds(180, 50, 50, 30);
		
		JLabel lblMaximoMultiplicador = new JLabel();
		lblMaximoMultiplicador.setText("Máximo Multiplicador: ");
		lblMaximoMultiplicador.setBounds(20, 90, 150, 30);
		
		JTextField txtMaximoMultiplicador = new JTextField();
		txtMaximoMultiplicador.setBounds(180, 90, 50, 30);
		
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 140, 100, 30);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(130, 140, 100, 30);
		
		
		
		
		tela.getContentPane().add(lblMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(lblMinimoMultiplicador);
		tela.getContentPane().add(txtMinimoMultiplicador);
		tela.getContentPane().add(lblMaximoMultiplicador);
		tela.getContentPane().add(txtMaximoMultiplicador);
		tela.getContentPane().add(buttonLimpar);
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String multiplicando = txtMultiplicando.getText();
				String minimo = txtMinimoMultiplicador.getText();
				String maximo = txtMaximoMultiplicador.getText();
				
				System.out.println("o Valor do multiplicando é:  " + multiplicando);
				System.out.println("O Valor do minimo é: " + minimo);
				System.out.println("O Valor do máximo é: " + maximo);
				
				// Casting - conversão de um tipo para outro
				double multiplicandoDouble = Double.parseDouble(multiplicando);
				double minimoDouble = Double.parseDouble(minimo);
				double maximoDouble = Double.parseDouble(maximo);
				
				Tabuada tabuada = new Tabuada();
				tabuada.setMinimoMultiplicador(multiplicandoDouble);
				tabuada.setMaximoMultiplicador(maximoDouble);
				tabuada.setMinimoMultiplicador(minimoDouble);
				tabuada.calcularTabuada();
				String resultado[] = tabuada.calcularTabuada();
				
				JList listTabuada = new JList(resultado);
				listTabuada.setBounds(20, 190, 210, 300);
				tela.getContentPane().add(listTabuada);
				
			}
		});
		
		
		tela.setVisible(true);
		
		
	}
	
}
