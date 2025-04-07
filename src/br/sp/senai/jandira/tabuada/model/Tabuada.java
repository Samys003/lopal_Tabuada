package br.sp.senai.jandira.tabuada.model;

public class Tabuada {
	
	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;
	
	
	public double getMultiplicando() {
		return multiplicando;
	}
	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}
	public double getMinimoMultiplicador() {
		return minimoMultiplicador;
	}
	public void setMinimoMultiplicador(double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
	}
	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}
	public void setMaximoMultiplicador(double maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}
	
	public String[] calcularTabuada() {
		if(minimoMultiplicador > maximoMultiplicador) {
			double temp = minimoMultiplicador;
			minimoMultiplicador = maximoMultiplicador;
			maximoMultiplicador = temp;
			
		}
		int tamanho = (int) (maximoMultiplicador - minimoMultiplicador + 1);
		String resultado[] = new String[tamanho];
		
		int contador = 0;
		while (minimoMultiplicador <= maximoMultiplicador) {
			double produto = multiplicando * minimoMultiplicador;
			String linha = multiplicando + "x" + minimoMultiplicador + "=" + produto;
			resultado[contador] = linha;
			System.out.println(linha);
		    minimoMultiplicador++;
		
		}
		System.out.println("Fim");
		return resultado;
		
	}	
}
