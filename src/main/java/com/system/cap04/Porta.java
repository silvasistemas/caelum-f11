package com.system.cap04;

public class Porta {
	boolean aberta;
	String cor;
	double dimensaoX, dimensaoY, dimensaoZ;
	static int contPortaAberta = 0;
	
	void abre() {
		this.aberta = true;
		Porta.contPortaAberta++;
	}
	
	void fecha() {
		this.aberta = false;
		Porta.contPortaAberta--;
	}
	
	void pinta(String cor) {
		this.cor = cor;
	}
	
	boolean estaAberta() {
		if (aberta) {
			System.out.println("A porta está aberta!");
			return true;
		} else {
			System.out.println("A porta está fechada!");
			return false;
		}
	}
		
	void mostra() {
		System.out.println("Cor: " + this.cor);
		System.out.println("Altura: " + dimensaoX + "m");
		System.out.println("Largura: " + dimensaoY + "cm");
		System.out.println("Profundidade: " + dimensaoZ + "cm");
		this.estaAberta();
	}
}
