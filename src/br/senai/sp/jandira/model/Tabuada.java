package br.senai.sp.jandira.model;

public class Tabuada {
	
	private int multiplicando;
	private int multiplicador;
	private int resultado;
	private int contador = multiplicador;
	
	public void setMultiplicando(String multiplicando) {
		this.multiplicando = Integer.parseInt(multiplicando);
	}
	
	public int getMultiplicando() {
		return multiplicando;
	}
	
	public void setMultiplicador(String multiplicador) {
		this.multiplicador = Integer.parseInt(multiplicador);
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
