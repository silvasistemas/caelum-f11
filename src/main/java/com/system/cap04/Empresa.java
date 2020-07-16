package com.system.cap04;

public class Empresa {
	String nome;
	String cnpj;
	Funcionario[] empregados;
	static int posicaoVazia;
	
	void adiciona(Funcionario f) {
		if (empregados.length == Empresa.posicaoVazia) {
			System.out.println("Array de funcion�rio est� cheio.");
		} else {
			this.empregados[Empresa.posicaoVazia] = f;
			Empresa.posicaoVazia++;
		}
	}
		
	void mostraEmpregados() {
		for (int i = 0; i < this.empregados.length; i++) {
			System.out.println(this.empregados[i].nome + " - posi��o: " + i);
			System.out.println("Sal�rio:  R$" + this.empregados[i].salario);
		}
	}
}
