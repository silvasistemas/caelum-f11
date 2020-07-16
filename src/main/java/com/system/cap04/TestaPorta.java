package com.system.cap04;

public class TestaPorta {

	public static void main(String[] args) {
		Porta p = new Porta();
		p.dimensaoX = 2.10;
		p.dimensaoY = 70;
		p.dimensaoZ = 8;
		
		p.abre();
		//p.fecha();
		
		p.pinta("Vermelha");
		p.mostra();

	}

}
