package com.system.cap04;

public class Funcionario {
	String nome;
	double salario;
	Data dataAdmissao;
	
	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: " + salario);
		/*System.out.println("Dia: " + this.dataAdmissao.dia);
		System.out.println("M�s: " + this.dataAdmissao.mes);
		System.out.println("Ano: " + this.dataAdmissao.ano);*/
		System.out.println("Data de admiss�o: " + this.dataAdmissao.dataFormatada());
	}
}
