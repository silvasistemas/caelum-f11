package com.system.cap04;

public class PrincipalConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		
		conta1.agencia = "0647-1";
		conta1.dataAbertura = "21/02/2018";
		conta1.numero = 6420;
		conta1.titular = "Danniery";
		conta1.saldo = 500.0;
		
		conta1.deposita(100);
		//System.out.println("Saldo: R$ " + conta1.saldo);		
		
		//conta1.saca(conta1.calculaRendimento());
		
		System.out.println(conta1.recuperaDadosParaImpressao());
		System.out.println("Rendimento mensal: R$ " + conta1.calculaRendimento());
	}

}
