package com.system.cap04;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Data data = new Data();
		f1.dataAdmissao = data;
		
		f1.nome = "Danniery";
		f1.salario = 2000;
		
		data.dia = 22;
		data.mes = 02;
		data.ano = 2018;
		
		f1.mostra();
		
	}

}
