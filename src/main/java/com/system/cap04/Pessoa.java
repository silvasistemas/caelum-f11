package com.system.cap04;

public class Pessoa {
	String nome;
	int idade;
	
	void fazAniversario() {
		this.idade += 1;
	}
	
	void mostra( ) {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
	}
}
