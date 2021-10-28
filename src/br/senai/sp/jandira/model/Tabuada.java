package br.senai.sp.jandira.model;

public class Tabuada {
	
	private int multiplicando;
	private int multiplicador;
	private int resultado;
	private int contador = multiplicador;
	
	public void setMultiplicando(int multiplicando) {
		this.multiplicando = multiplicando;
	}
	
	public int getMultiplicando() {
		return multiplicando;
	}
	
	public void setMultiplicador(int multiplicador) {
		this.multiplicador = multiplicador;
	}

	public int getMultiplicador() {
		return multiplicador;
	}

	public void setResultado() {
		
		while (contador <= multiplicador) {
			
			this.resultado = multiplicando * contador;
			
			System.out.println(multiplicando + " x " + contador + " = " + this.resultado);
			
			contador++;		
		}
	}

	public int getResultado() {
		return resultado;
	}
	
	
	

}
