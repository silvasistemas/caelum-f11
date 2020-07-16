package com.system.cap04;

public class Conta {
	int numero;
	String agencia, titular, dataAbertura;
	double saldo;
	
	void saca (double valor) {
		this.saldo -= valor;
	}
	
	void deposita (double valor) {
		this.saldo += valor;
	}
	
	double calculaRendimento () {
		double rendimento = this.saldo*0.1;
		return rendimento;
	}
	
	String recuperaDadosParaImpressao () {
		String dados = "Titular: " + this.titular;
		dados += "\nData de bertura: " + this.dataAbertura;
		dados += "\nAgência: " + this.agencia;
		dados += "\nNúmero: " + this.numero;
		dados += "\nSaldo: R$ " + this.saldo;
		return dados;
		
	}
}
