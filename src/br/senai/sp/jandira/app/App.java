package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.Tabuada;
import br.senai.sp.jandira.ui.Frame;

public class App {

	public static void main(String[] args) {
		
		Tabuada tabuada = new Tabuada();
		
		//tabuada.setMultiplicando(9);
		//tabuada.setMultiplicador(8);
		
		tabuada.setResultado();
		
		Frame tela = new Frame();
		tela.criarFrame();
		

	}

}
