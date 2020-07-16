package com.system.cap04;

public class Fibonacci {
	int chamadas;
	
	int calculaFibonacci(int n){
		chamadas++;
		if(n==0){
			return 0;
	    }
	        
	    if(n==1){
	        return 1;
	    }
	        
	    return ( calculaFibonacci(n-1) + calculaFibonacci(n-2) );
	 }
}

