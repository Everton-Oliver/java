package Condicional;

import java.util.*;

import java.math.*;

public class Exercicio4 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double num, resultado;
		
		System.out.println("Digite um n�mero positivo:");
		num = ler.nextInt();
		
		if (num<=0) {
			System.out.println("Voc� digitou um n�mero inv�lido");
		} 
		else {
			
		
		if (num %2 == 0) {
			resultado = Math.sqrt(num);
			System.out.println("O n�mero " + num + " � par, e a raiz quadrada � " + resultado);
		}
		
		else {
			
			resultado = Math.pow(num,2);
			System.out.println("O n�mero " + num + " � impar, e ao quadrado � " + resultado);
		}
		
	}
  }
}