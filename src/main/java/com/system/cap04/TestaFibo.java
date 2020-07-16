package com.system.cap04;

public class TestaFibo {

	public static void main(String[] args) {
		Fibonacci fibo = new Fibonacci();
		for (int i = 1; i <= 40; i++) {
			int resultado = fibo.calculaFibonacci(i);
			System.out.print(resultado + " ");
		}
		System.out.println("\n" + fibo.chamadas);
	}

}
