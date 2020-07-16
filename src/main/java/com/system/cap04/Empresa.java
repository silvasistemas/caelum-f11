package com.system.cap04;

public class Empresa {
	String nome;
	String cnpj;
	Funcionario[] empregados;
	static int posicaoVazia;
	
	void adiciona(Funcionario f) {
		if (empregados.length == Empresa.posicaoVazia) {
			System.out.println("Array de funcionário está cheio.");
		} else {
			this.empregados[Empresa.posicaoVazia] = f;
			Empresa.posicaoVazia++;
		}
	}
		
	void mostraEmpregados() {
		for (int i = 0; i < this.empregados.length; i++) {
			System.out.println(this.empregados[i].nome + " - posição: " + i);
			System.out.println("Salário:  R$" + this.empregados[i].salario);
		}
	}
}
