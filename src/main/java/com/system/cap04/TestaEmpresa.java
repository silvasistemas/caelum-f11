package com.system.cap04;

public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];
		
		Funcionario f1 = new Funcionario();
		f1.salario = 1000;
		f1.nome = "Jany";
		empresa.adiciona(f1);
		
		Funcionario f2 = new Funcionario();
		f2.salario = 500;
		f2.nome = "Tulio";
		empresa.adiciona(f2);
		

		Funcionario f3 = new Funcionario();
		f3.salario = 500;
		f3.nome = "Tulio Santana";
		empresa.adiciona(f3);
		

		Funcionario f4 = new Funcionario();
		f4.salario = 500;
		f4.nome = "Tulio David";
		empresa.adiciona(f4);
		
		
		/*for(int i = 0; i < empresa.empregados.length; i++) {
			System.out.println(empresa.empregados[i].nome + " posição " + i);
		}*/
		
		empresa.mostraEmpregados();
		
		//System.out.println(f4.salario);
		//System.out.println(empresa.empregados[1].nome);
	
	}

}
