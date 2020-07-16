package com.system.cap04;

public class Casa {
	String cor;
	Porta porta1 = new Porta();
	Porta porta2;
	Porta porta3;
	
	void pinta(String cor) {
		this.cor = cor;
	}
	
	int quantasPortasEstaoAbertas() {
		System.out.println("Qtde portas abertas: " + Porta.contPortaAberta);
		return Porta.contPortaAberta;
	}
}
