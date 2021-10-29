package br.senai.sp.jandira.model;

public class Tabuada {
	
	private int multiplicador, multiplicando;
	
	public int getMultiplicador() {
		return multiplicador;
	}

	public void setMultiplicador(String multiplicador) {
		this.multiplicador = Integer.parseInt(multiplicador);
	}

	public int getMultiplicando() {
		return multiplicando;
	}

	public void setMultiplicando(String multiplicando) {
		this.multiplicando = Integer.parseInt(multiplicando);
	}


	public String[] calcular() {
		
		String tabuada[] = new String[multiplicador + 1];
		
		for (int index = 0; index < multiplicador; index++) {
			
			int resultado = multiplicando * index;
			
			tabuada[index] = multiplicando + " x " + index + " = " + resultado;
		}
		
		return tabuada;
	}
	
	
	
	
	
	

}
