package com.system.cap04;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "Danniery";
		p.idade = 41;
		
		p.mostra();
		
		p.fazAniversario();
		
		p.mostra();
	}

}
