package com.system.cap04;

public class TestaCasa {

	public static void main(String[] args) {
		Casa casa = new Casa();
		Porta porta = new Porta();
		
		casa.porta2 = porta; //a 'porta1' do objeto recebe a mesma referencia de 'porta'
		casa.porta3 = porta;
		casa.pinta("Azul");
		casa.porta1.cor = "Verde";
		casa.porta2.cor = "Vermelho";
		casa.porta2.abre();
		casa.porta3.cor = "Marrom";
		casa.porta3.abre();
		
		casa.porta3.mostra();
		casa.quantasPortasEstaoAbertas();
	}

}
